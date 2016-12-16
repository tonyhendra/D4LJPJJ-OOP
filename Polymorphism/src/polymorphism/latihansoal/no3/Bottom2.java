/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.latihansoal.no3;

/**
 *
 * @author tonyhendra
 */
class Top{
    public Top(String s){
        System.out.print("B");
    }
}
public class Bottom2 extends Top {
    String s;
    public Bottom2(String s) {
        //Tidak bisa di run karena pada kelas parent tidak ada default constructor
        //Supaya dapat di run tambahkan default constructor pada kelas parent atau tambahkan super(s) pada kelas child
        super(s); 
        System.out.print("D"); 
    }
    public static void main(String [] args) {
        new Bottom2("C");
        System.out.println(" ");
    }
}
