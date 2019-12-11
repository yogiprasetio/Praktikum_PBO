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
public class Motor extends Kendaraan{
    private String merk,plat,type;
    public Waktu waktu;
    public Biaya by;
    
    public Motor(String plat, String typee,String tanggal,int biaya,int waktuMasuk,int waktuKeluar) {
        waktu = new Waktu(tanggal,waktuMasuk,waktuKeluar);
        SetPlat(plat);
        Type(typee);
        by=new Biaya(biaya);
       
    }
    
    
    private void SetMerk(String merk){
        this.merk=merk;
    }
    
    private void SetPlat(String plat){
        this.plat=plat;
    }
    
    public String getPlat(){
        return plat;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public String getType(){
        return type;
    }

    @Override
    void Type(String typee) {
        this.type=typee;
    }
    
}
