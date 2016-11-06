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
public class Kerucut extends Lingkaran {
    private double tinggi;

    public Kerucut() {
    }

    public Kerucut(double tinggi, double r) {
        super(r);
        this.tinggi = tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }
    
    public double getVolume(){
        return (super.getLuas()*tinggi)/3;
    }

    @Override
    public String toString() {
        return "Kerucut{" +super.toString()+ " tinggi=" + tinggi + " Volume="+getVolume()+"}";
    }
    
    
    
    
}
