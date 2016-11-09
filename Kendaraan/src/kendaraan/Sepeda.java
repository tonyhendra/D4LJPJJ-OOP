/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author tonyhendra
 */
public class Sepeda extends Kendaraan {
    protected int jmlSadel;
    protected int jmlGir;

    public Sepeda(int jmlSadel, int jmlGir, int jmlRoda, String warna) {
        super(jmlRoda, warna);
        this.jmlSadel = jmlSadel;
        this.jmlGir = jmlGir;
    }

    public void setJmlSadel(int jmlSadel) {
        this.jmlSadel = jmlSadel;
    }

    public void setJmlGir(int jmlGir) {
        this.jmlGir = jmlGir;
    }
    

    public int getJmlSadel() {
        return jmlSadel;
    }

    public int getJmlGir() {
        return jmlGir;
    }

    @Override
    public String toString() {
        return "Sepeda{" + "jmlSadel=" + jmlSadel + ", jmlGir=" + jmlGir + '}';
    }

    
    
    
    
}
