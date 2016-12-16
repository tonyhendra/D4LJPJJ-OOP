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
abstract public class Animal {
        abstract public void greeting();
}
/*dalam satu kelas bisa terdapat lebih dari satu class, 
dengan syarat hanya ada satu kelas dengan akses modifier public
yaitu kelas yang memiliki nama yang sama dengan nama file
*/
class Cat extends Animal {
   @Override
   public void greeting() {
      System.out.println("Meow!");
   }
}
class Dog extends Animal {
   @Override
   public void greeting() {
      System.out.println("Woof!");
   }
   
   public void greeting(Dog another) {
      System.out.println("Woooooooooof!");
   }
}
class BigDog extends Dog {
   @Override
   public void greeting() {
      System.out.println("Woow!");
   }
   
   @Override
   public void greeting(Dog another) {
      System.out.println("Woooooowwwww!");
   }
}
