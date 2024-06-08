        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ittp.pbo.entity;

/**
 *
 * @author MHIKAM
 */
import java.util.Date;

public class Parkir {
    private String kodeParkir;
    private Date waktuMasuk;
    private Date waktuKeluar;

    public Parkir(String kodeParkir, Date waktuMasuk, Date waktuKeluar  ) {
        this.kodeParkir = kodeParkir;
        this.waktuMasuk = waktuMasuk;
        this.waktuKeluar = waktuKeluar;
    }

    public Parkir(){}

    public String getKodeParkir() {
        return kodeParkir;
    }

    public void setKodeParkir(String kodeParkir) {
        this.kodeParkir = kodeParkir;
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
}

