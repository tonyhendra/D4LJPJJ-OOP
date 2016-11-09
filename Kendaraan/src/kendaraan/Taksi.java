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
public class Taksi extends Mobil {
    protected int tarifAwal;
    protected int tarifPerKm;

    public Taksi(int jmlRoda, String warna, int tarifAwal, int tarifPerKm, String bahanBakar, int kapasitasMesin) {
        super(jmlRoda,warna,bahanBakar, kapasitasMesin);
        this.tarifAwal = tarifAwal;
        this.tarifPerKm = tarifPerKm;
    }

    public void setTarifAwal(int tarifAwal) {
        this.tarifAwal = tarifAwal;
    }

    public void setTarifPerKm(int tarifPerKm) {
        this.tarifPerKm = tarifPerKm;
    }

    public int getTarifAwal() {
        return tarifAwal;
    }

    public int getTarifPerKm() {
        return tarifPerKm;
    }

    @Override
    public String toString() {
        return "Taksi{" + "tarifAwal=" + tarifAwal + ", tarifPerKm=" + tarifPerKm + '}';
    }
    
    
}
