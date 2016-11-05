/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;
import java.awt.Point;
/**
 *
 * @author tonyhendra
 */
public class Main {
    public static void main(String[] args){
        Lingkaran l1 = new Lingkaran(2,new Point(2,2));
        Lingkaran l2 = new Lingkaran(1,new Point(7,1));
        Lingkaran l3 = new Lingkaran(1.5,new Point(4,1));    
        
        System.out.println("Lingkaran 1 bersinggungnan dengan lingkaran 2 : "+l1.cekBersinggungan(l2));
        System.out.println("Lingkaran 2 bersinggungnan dengan lingkaran 3 : "+l2.cekBersinggungan(l3));
        System.out.println("Lingkaran 3 bersinggungnan dengan lingkaran 1 : "+l3.cekBersinggungan(l1));
    }
    
}
