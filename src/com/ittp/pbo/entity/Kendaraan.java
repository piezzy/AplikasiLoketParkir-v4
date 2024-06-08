/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ittp.pbo.entity;

/**
 *
 * @author MHIKAM
 */
public abstract class Kendaraan {
    public String noPlat;
    public String nama;
    public String jenisKendaraan;
    public String merek;
    public String warna;

    public Kendaraan(String noPlat, String nama, String merek, String warna) {
        this.noPlat = noPlat;
        this.nama = nama;
        this.merek = merek;
        this.warna = warna;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public abstract int getTarifPerHari();
}
