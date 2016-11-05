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
public class Lingkaran {
    private double jarijari;
    private Point p;

    public Lingkaran(double jarijari, Point p) {
        this.jarijari = jarijari;
        this.p = p;
    }
    public double getJarijari() {
        return jarijari;
    }

    public Point getP(){
        return p;
    }
    
    public Boolean cekBersinggungan(Lingkaran l2){
        double R = Math.sqrt(Math.pow(l2.getP().getX()- getP().getX(),2)
                +Math.pow(l2.getP().getY()- getP().getY(),2));
        if(R==jarijari+l2.jarijari){ //Bersinggungan
            return true;
        }else{ //Tidak Bersinggungan
            return false;
        }
        
    }
        
}
