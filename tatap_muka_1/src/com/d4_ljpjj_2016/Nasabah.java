package com.d4_ljpjj_2016;

/**
 * Created by tonyhendra on 10/16/2016.
 */
public class Nasabah {
    private String nama;
    private Tabungan tabungan;

    public Nasabah(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public Tabungan getTabungan() {
        return tabungan;
    }

    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan;
    }

    @Override
    public String toString() {
        return "Nasabah ( "+" nama : "+nama+", tabungan : "+tabungan+" )";
    }
}
