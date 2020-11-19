/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menghitung volume bangun ruang
 */
public class Kerucut extends BangunRuang{
     private int tinggi;

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double Volume(){
        double volume = ((Math.PI * Math.pow(jariJari, 2)) * tinggi) / 3;
        return volume;
    }
}
