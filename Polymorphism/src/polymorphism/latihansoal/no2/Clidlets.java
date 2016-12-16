/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.latihansoal.no2;

/**
 *
 * @author tonyhendra
 */
class Clidders{
    /*public final void flipper(){ Tidak Bisa di override karena method tsb bertipe final*/
    public void flipper(){ //Hapus final supaya class ini dapat dijalankan
        System.out.println("Clidder");
    }
}

public class Clidlets extends Clidders{
    public void flipper(){
        System.out.println("Flip a clidlet");
        super.flipper();
    }
    public static void main(String[] args){
        new Clidlets().flipper();
    }
}