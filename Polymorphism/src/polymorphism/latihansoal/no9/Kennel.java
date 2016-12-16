/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.latihansoal.no9;

/**
 *
 * @author tonyhendra
 */
class Dog { }
class Beagle extends Dog { }

public class Kennel {
    public static void main(String [] arfs) {
        Beagle bl = new Beagle();
        Dog dog1 = new Dog();
        Dog dog2 = bl;
        // insert code here
        Beagle b2 = (Beagle) dog1;
        Beagle b3 = (Beagle) dog2;
        //Beagle b4 = dog2; //proses downcast nya salah
    }
}
