/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ittp.pbo.service;

/**
 *
 * @author MHIKAM
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import com.ittp.pbo.entity.ParkirDetail;
import com.ittp.pbo.connection.DatabaseUtilities;
import com.ittp.pbo.entity.Kendaraan;
import com.ittp.pbo.entity.Mobil;
import com.ittp.pbo.entity.Motor;
import com.ittp.pbo.entity.Parkir;
import com.ittp.pbo.view.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ParkirService {
    
    private final Connection connection;
    private String noPlat;
    private String nama;
    private String merek;
    private String warna;
    
    
    
    public ParkirService(Connection connection) {
        this.connection = connection;
    }

    public void MasukanKendaraan(ParkirDetail parkirDetail) {
    String insertParkir = "INSERT INTO Parkir (kodeParkir, waktuMasuk, waktuKeluar) VALUES (?, ?, ?)";
    String insertKendaraan = "INSERT INTO Kendaraan (noPlat, nama, jenisKendaraan, merek, warna) VALUES (?, ?, ?, ?, ?)";
    String insertParkirDetail = "INSERT INTO ParkirDetail (id, kodeParkir, noPlat, status, waktuMasuk, waktuKeluar, harga) VALUES (?, ?, ?, ?, ?, ?, ?)";
    String cekDuplikat = "Select * FROM kendaraan WHERE noPlat = ?";
    Connection conn = DatabaseUtilities.getMyConnection();
       
    try {

        PreparedStatement parkirStmt = conn.prepareStatement(insertParkir);
        parkirStmt.setString(1, parkirDetail.getParkir().getKodeParkir());
        parkirStmt.setDate(2, new java.sql.Date(parkirDetail.getParkir().getWaktuMasuk().getTime()));
        parkirStmt.setDate(3, parkirDetail.getParkir().getWaktuKeluar() != null ? new java.sql.Date(parkirDetail.getParkir().getWaktuKeluar().getTime()) : null);
        parkirStmt.executeUpdate();

        PreparedStatement cekDuplikatStmt = conn.prepareStatement(cekDuplikat);
        cekDuplikatStmt.setString(1, EntryForm.noPlat);
        ResultSet rs = cekDuplikatStmt.executeQuery();
        if (!rs.next()){        
            PreparedStatement kendaraanStmt = conn.prepareStatement(insertKendaraan);
            kendaraanStmt.setString(1, parkirDetail.getKendaraan().getNoPlat());
            kendaraanStmt.setString(2, parkirDetail.getKendaraan().getNama());
            kendaraanStmt.setString(3, parkirDetail.getKendaraan().getJenisKendaraan());
            kendaraanStmt.setString(4, parkirDetail.getKendaraan().getMerek());
            kendaraanStmt.setString(5, parkirDetail.getKendaraan().getWarna());
            kendaraanStmt.executeUpdate();
        }

        PreparedStatement parkirDetailStmt = conn.prepareStatement(insertParkirDetail);
        parkirDetailStmt.setInt(1, parkirDetail.getId());
        parkirDetailStmt.setString(2, parkirDetail.getParkir().getKodeParkir());
        parkirDetailStmt.setString(3, parkirDetail.getKendaraan().getNoPlat());
        parkirDetailStmt.setString(4, "Masuk");
        parkirDetailStmt.setDate(5, new java.sql.Date(parkirDetail.getParkir().getWaktuMasuk().getTime()));
        parkirDetailStmt.setDate(6, parkirDetail.getParkir().getWaktuKeluar() != null ? new java.sql.Date(parkirDetail.getParkir().getWaktuKeluar().getTime()) : null);
        parkirDetailStmt.setDouble(7, 0.0);
            
        parkirDetailStmt.executeUpdate();

    } catch (SQLException ex) {
        ex.printStackTrace();   
    }
}

            
    public String generateKodeParkir() {
    String kodeParkir = null;
    String query = "SELECT MAX(kodeParkir) AS kode FROM ParkirDetail";
    Connection conn = DatabaseUtilities.getMyConnection();
         
    try {
        PreparedStatement stmt = conn.prepareStatement(query);
         ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            kodeParkir = rs.getString("kode");
        }

    if (kodeParkir == null) {
        kodeParkir = "PKR0000001";
    } else {
        int sequence = Integer.parseInt(kodeParkir.substring(4)) + 1;
        kodeParkir = String.format("PKR%05d", sequence);
    } 
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    

    
    return kodeParkir;
}
  
    public boolean KeluarkanKendaraan(String kodeParkir, Date waktuKeluar) throws FileNotFoundException{
        LocalDate tanggal1;
        LocalDate tanggal2 = Instant.ofEpochMilli(waktuKeluar.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
        long selisih = 0;
        int harga = 0;
        String jenisKendaraan;
        
        String query = "SELECT * FROM parkirdetail WHERE kodeParkir = ?";
        try {
            PreparedStatement querystmt = connection.prepareStatement(query);
            querystmt.setString(1, kodeParkir);
            ResultSet rs = querystmt.executeQuery();
            if (rs.next()){
                tanggal1 = rs.getDate("waktuMasuk").toLocalDate();
                selisih = ChronoUnit.DAYS.between(tanggal1, tanggal2);
            }
            
            query = "SELECT jenisKendaraan FROM kendaraan WHERE noPlat = (SELECT noPlat FROM parkirdetail WHERE kodeParkir = ?)";
            querystmt = connection.prepareStatement(query);
            querystmt.setString(1, kodeParkir);
            rs = querystmt.executeQuery();

        if (rs.next()){
            jenisKendaraan = rs.getString("jenisKendaraan");

            Kendaraan kendaraan;
            if (jenisKendaraan.equals("Mobil")){
                kendaraan = new Mobil(noPlat, nama, merek, warna);
            } else {
                kendaraan = new Motor(noPlat, nama, merek, warna);
            }

            harga = (int) (selisih + 1) * kendaraan.getTarifPerHari();
        }

            query = "UPDATE parkir SET waktuKeluar = ? WHERE kodeParkir = ?";
            querystmt = connection.prepareStatement(query);
            querystmt.setDate(1, new java.sql.Date(waktuKeluar.getTime()));
            querystmt.setString(2, kodeParkir);
            querystmt.executeUpdate();
            
            query = "UPDATE parkirdetail SET waktuKeluar = ?, status = ?, harga = ? WHERE kodeParkir = ?";
            querystmt = connection.prepareStatement(query);
            querystmt.setDate(1, new java.sql.Date(waktuKeluar.getTime()));
            querystmt.setString(2, "Keluar");
            querystmt.setInt(3, harga);
            querystmt.setString(4, kodeParkir);
            querystmt.executeUpdate();
    
            Document document = new Document();
            
        try {
            String filePath = "C:\\Users\\MHIKAM\\OneDrive\\Dokumen\\!ITTP\\Semester 4\\PBO\\AplikasiParkir\\AplikasiLoketParkir-v4\\Invoice\\" + kodeParkir + ".pdf";
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            document.add(new Paragraph("Invoice Parkir"));
            document.add(new Paragraph("---------------------------"));
            document.add(new Paragraph("Kode Parkir: " + kodeParkir));
            document.add(new Paragraph("Waktu Keluar: " + waktuKeluar));
            document.add(new Paragraph("Lama Parkir: " + (selisih + 1) + " Hari"));
            document.add(new Paragraph("Harga: " + harga + " Rupiah"));
            document.close();
            JOptionPane.showMessageDialog(null, "Invoice Parkir berhasil disimpan sebagai PDF!");

        } catch (DocumentException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error saat menyimpan invoice parkir sebagai PDF!");
        }
            JOptionPane.showMessageDialog(null, "Invoice Parkir\n"
                + "---------------------------\n"
                + "Kode Parkir: " + kodeParkir + "\n"
                + "Waktu Keluar: " + waktuKeluar + "\n"
                + "Lama Parkir: " + (selisih +1 ) + " Hari\n"
                + "Harga: " + harga + " Rupiah");            
            return true;
        }
        catch (SQLException e) {
        e.printStackTrace();
        return false;
        }
    }

private static final String DELETE_SQL = "DELETE FROM parkirdetail WHERE kodeParkir = ?";
    public void deleteParkirDetail(String kodeParkir) throws SQLException {
        
        try (Connection conn = DatabaseUtilities.getMyConnection();
             PreparedStatement statement = conn.prepareStatement(DELETE_SQL)) {

            statement.setString(1, kodeParkir);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

}


    


