package com.d4_ljpjj_2016;

import java.util.Arrays;

/**
 * Created by tonyhendra on 10/16/2016.
 */
public class Bank {
    private Nasabah nasabah[];
    int jumlahNasabah;

    public Bank(){
        nasabah = new Nasabah[10];
        jumlahNasabah = 0;
    }
    public void tambahNasabah(String nama){
        Nasabah n = new Nasabah(nama);
        nasabah[jumlahNasabah] = n;
        jumlahNasabah++;
    }
    public int getJumlahNasabah(){
        return jumlahNasabah;
    }
    public Nasabah getNasabah(int indeks){
        return nasabah[indeks];
    }

    @Override
    public String toString() {
        String s = "Jumlah Nasabah : "+jumlahNasabah+"\n";
        for (int i =0; i<jumlahNasabah;i++){
            s = s + nasabah[i]+"\n";
        }
        return s;
    }
}
