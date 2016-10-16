package com.d4_ljpjj_2016;

/**
 * Created by tonyhendra on 10/16/2016.
 */
public class Main2 {
    public static void main(String[] args){
        Bank bank = new Bank();
        bank.tambahNasabah("Ani");
        Tabungan t1 = new Tabungan(500000);
        bank.getNasabah(0).setTabungan(t1);

        bank.tambahNasabah("Mutiara");
        Tabungan t2 = new Tabungan(1000000);
        bank.getNasabah(1).setTabungan(t2);

        System.out.println(bank.toString());


    }
}
