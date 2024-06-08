/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ittp.pbo.entity;

import java.util.Date;

/**
 *
 * @author MHIKAM
 */
public class ParkirDetail{
    private int id;
    private String kodeParkir;
    private String noPlat;
    private String status;
    private Date waktuMasuk;
    private Date waktuKeluar;
    private int harga;
    private Parkir parkir;
    private Kendaraan kendaraan;

    public ParkirDetail() {}

    public ParkirDetail(int id, String kodeParkir, String noPlat, String status, Date waktuMasuk, Date waktuKeluar, int harga, Parkir parkir, Kendaraan kendaraan) {
        this.id = id;
        this.kodeParkir = kodeParkir;
        this.noPlat = noPlat;
        this.status = status;
        this.waktuMasuk = waktuMasuk;
        this.waktuKeluar = waktuKeluar;
        this.harga = harga;
        this.parkir = parkir;
        this.kendaraan = kendaraan;
    }

    public ParkirDetail(Parkir parkir, Kendaraan kendaraan) {
        this.parkir = parkir;
        this.kendaraan = kendaraan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodeParkir() {
        return kodeParkir;
    }

    public void setKodeParkir(String kodeParkir) {
        this.kodeParkir = kodeParkir;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getWaktuMasuk() {
        return waktuMasuk;
    }

    public void setWaktuMasuk(Date waktuMasuk) {
        this.waktuMasuk = waktuMasuk;
    }

    public Date getWaktuKeluar() {
        return waktuKeluar;
    }

    public void setWaktuKeluar(Date waktuKeluar) {
        this.waktuKeluar = waktuKeluar;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Parkir getParkir() {
        return parkir;
    }

    public void setParkir(Parkir parkir) {
        this.parkir = parkir;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }
}