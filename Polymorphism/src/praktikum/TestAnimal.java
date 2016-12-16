/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author tonyhendra
 */
public class TestAnimal {
    public static void main(String[] args) {
        // Using the subclasses

        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();

        // Using Polymorphism   
        Animal animal1 = new Cat();
        animal1.greeting();
        Animal animal2 = new Dog();
        animal2.greeting();
        Animal animal3 = new BigDog();
        animal3.greeting();
        //Animal animal4 = new Animal(); //Error, karena Animal merupakan kelas abstract
     
        // Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;//mengkonversi obyek dari subclass ke variabel dengan tipe superclass (upcasting) 
        //Cat cat2 = (Cat)animal2; 
        //Error ketika di running. karena animal2 merupakan inisiasi dari kelas Dog.
        Cat cat2 = (Cat)animal1;
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }
}
