/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan61.bangunruang;

import model.Bola;
import model.Kerucut;
import model.Tabung;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menghitung volume bangun ruang
 */
public class PBOIF210119064Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bola bola = new Bola();
        bola.setJariJari(7);
        System.out.printf("Hasil : V = %.1f cm^3 \n", bola.Volume());
        
        Tabung tabung = new Tabung();
        tabung.setJariJari(10);
        tabung.setTinggi(21);
        System.out.printf("Hasil : V = %.0f cm^3 \n", tabung.Volume());
        
        Kerucut kerucut = new Kerucut();
        kerucut.setJariJari(14);
        kerucut.setTinggi(9);
        System.out.printf("Hasil : V = %.0f cm^3 \n", kerucut.Volume());
    }
    
}
