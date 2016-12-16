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
class Clidder {
  private final void flipper() { System.out.println ("Clidder"); }
}

public class Clidlets2 extends Clidder {
  public final void flipper() { System.out.println("Clidlet");  }
  public static void main(String [] args) {
    new Clidlets2().flipper();
  }
}

