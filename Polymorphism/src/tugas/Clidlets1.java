/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author tonyhendra
 */
class Clidders {
  public void flipper() { System.out.println("Clidder"); }
}
public class Clidlets1 extends Clidders {
  public void flipper() {
    System.out.println("Flip a Clidlet");
    super.flipper();
  }
  public static void main(String [] args) {
    new Clidlets1().flipper();
  }
}
