/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ittp.pbo.entity;

/**
 *
 * @author MHIKAM
 */
public class Motor extends Kendaraan{
    
    public Motor (String noPlat, String nama, String merek, String warna){
        super(noPlat, nama, merek, warna);
    }
    
    @Override
    public int getTarifPerHari(){
        return 2000;
    }
}
