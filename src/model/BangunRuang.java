/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bagus_24
 */
public abstract class BangunRuang {
    protected int jariJari;

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }
    
    public abstract double Volume();
}
