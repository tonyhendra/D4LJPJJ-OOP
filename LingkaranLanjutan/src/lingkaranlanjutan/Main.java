/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaranlanjutan;

/**
 *
 * @author tonyhendra
 */
public class Main {
    public static void main(String args[]){
        Kerucut k1 = new Kerucut(4, 5);
        Silinder s1 = new Silinder(4, 5);
        System.out.println(k1.toString());
        System.out.println(s1.toString());
    }
    
}
