package com.d4_ljpjj_2016;

/**
 * Created by tonyhendra on 10/15/2016.
 */
public class Tabungan {
    private int saldo;

    public Tabungan (int saldo){
        this.saldo = saldo;
    }
    public int getSaldo(){
        return saldo;
    }
    public boolean ambilUang(int jumlah){
        if(saldo > jumlah){
            saldo = saldo - jumlah;
            return true;
        }
        return false;
    }
    public boolean simpanUang(int jumlah){
        saldo = saldo + jumlah;
        return  true;
    }
    public boolean transfer(Tabungan t2, int jumlah){
        if(saldo > jumlah){
            saldo = saldo - jumlah;
            t2.saldo = t2.saldo+jumlah;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return saldo + "";
    }
}
