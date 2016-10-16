package com.d4_ljpjj_2016;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tabungan t1 = new Tabungan(500000);
        t1.simpanUang(1000000);
        System.out.println("Saldo t1 = "+t1.getSaldo());
        t1.ambilUang(300000);

        Tabungan t2 = new Tabungan(1000000);
        t2.transfer(t1,500000);
        System.out.println("Setelah Transfer");
        System.out.println("Saldo t1 = "+t1.getSaldo());
        System.out.println("Saldo t2 = "+t2.getSaldo());
        System.out.println(t1.toString());


    }
}
