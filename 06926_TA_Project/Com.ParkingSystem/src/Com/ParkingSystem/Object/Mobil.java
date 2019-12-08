package Com.ParkingSystem.Object;

/**
 *
 * @author yogi-06926
 */
public class Mobil extends Kendaraan{
    private String type,merk,plat;
    public Waktu waktu;
    public Biaya by;
    
    public Mobil(String typee, String plat,String tanggal,int biaya,int waktuMasuk,int waktuKeluar) {
        Type();
        
        setPlat(plat);
        waktu= new Waktu(tanggal,waktuMasuk,waktuKeluar);
        by = new Biaya(biaya);
    }
    
   
    @Override
    void Type() {
        this.type="Mobil";
    }
    
    private void setMerk(String merk){
        this.merk=merk;
    }
    
    private void setPlat(String plat){
        this.plat=plat;
    }
    
    public String getType(){
        return type;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public String getPlat(){
        return plat;
    }
    
}
