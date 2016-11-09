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
public class Kendaraan {
    protected int jmlRoda;
    protected String warna;
    
    public Kendaraan(int jmlRoda, String warna){
        this.jmlRoda = jmlRoda;
        this.warna = warna;
    }

    public void setJmlRoda(int jmlRoda) {
        this.jmlRoda = jmlRoda;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    

    public int getJmlRoda() {
        return jmlRoda;
    }

    public String getWarna() {
        return warna;
    }

    @Override
    public String toString() {
        return "Kendaraan{" + "jmlRoda=" + jmlRoda + ", warna=" + warna + '}';
    }
    
    
    
    
}
