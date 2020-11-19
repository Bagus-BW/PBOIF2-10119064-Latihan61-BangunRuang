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
public abstract class BangunRuang {
    protected int jariJari;

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }
    
    public abstract double Volume();
}
