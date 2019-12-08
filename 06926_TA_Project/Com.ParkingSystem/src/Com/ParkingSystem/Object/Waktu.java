/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.ParkingSystem.Object;

/**
 *
 * @author yogi-06926
 */
public class Waktu {
    private String Tanggal;
    private int in,out;

   public Waktu(String tanggal,int waktuMasuk,int waktuKeluar) {
    tanggal(tanggal);
       setIn(waktuMasuk);
       setOut(waktuKeluar);
    }

    private void setIn(int waktuMasuk) {
        this.in = waktuMasuk;
    }

    private void setOut(int waktuKeluar) {
        this.out = waktuKeluar;
    }

    public int getIn() {
        return in;
    }

    public int getOut() {
        return out;
    }
    
    
    private void tanggal(String tanggal) {
        this.Tanggal=tanggal;
    }
    
    public String getTanggal(){
        return Tanggal;
    }
}
