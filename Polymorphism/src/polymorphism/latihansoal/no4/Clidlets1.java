/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.latihansoal.no4;

/**
 *
 * @author tonyhendra
 */
class Clidder {
    private final void flipper() { System.out.println ("Clidder"); }
}
public class Clidlets1 extends Clidder {
public final void flipper() { System.out.println("Clidlet"); }
public static void main(String [] args) {
    //Dapat dijalankan karena method flipper pada kelas parent memiliki hak akses private
    //Sehingga tidak dimiliki oleh kelas child
    new Clidlets1().flipper();
}
}
