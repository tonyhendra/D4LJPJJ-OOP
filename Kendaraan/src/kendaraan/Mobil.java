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
public class Mobil extends Kendaraan {
    protected String bahanBakar;
    protected int kapasitasMesin;
    
    public Mobil(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin) {
        super(jmlRoda,warna);
        this.bahanBakar = bahanBakar;
        this.kapasitasMesin = kapasitasMesin;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMobil{" + "bahanBakar=" + bahanBakar + ", kapasitasMesin=" + kapasitasMesin + '}';
    }
    
    
}
