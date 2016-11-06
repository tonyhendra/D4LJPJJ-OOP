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
public class Lingkaran {
    private double r;

    public Lingkaran() {
    }

    public Lingkaran(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }
    
    public double getDiameter(){
        return r*2;
    }
    
    public double getKeliling(){
        return (22/7)*getDiameter();
    }
    public double getLuas(){
        return (22/7)*Math.pow(r,2);
    }

    @Override
    public String toString() {
        return "r=" + r + " keliling="+getKeliling()+" Luas="+getLuas();
    }
    
    
}
