/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author tonyhendra
 */
public class Truk extends Mobil {
    protected int muatanMaks;

    public Truk(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin, int muatanMaks) {
        super(jmlRoda,warna,bahanBakar, kapasitasMesin);
        this.muatanMaks = muatanMaks;
    }

    public void setMuatanMaks(int muatanMaks) {
        this.muatanMaks = muatanMaks;
    }

    public int getMuatanMaks() {
        return muatanMaks;
    }

    @Override
    public String toString() {
        return super.toString()+"\nTruk{" + "muatanMaks=" + muatanMaks + '}';
    }
    
    
    
}
