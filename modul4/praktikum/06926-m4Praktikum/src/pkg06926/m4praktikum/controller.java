package pkg06926.m4praktikum;
import java.util.ArrayList;
/**
 *
 * @author yogi-06926
 */
public class controller extends biaya{
    ArrayList<kendaraan> list;
    int ongkosh=0;
    controller(){
        list = new ArrayList<>();
    }
    
    public void tambahParkir(int c,int waktuKeluar){
        String plat=list.get(c).getPlat();
        String tanggal=list.get(c).getTanggal();
        int waktuMasuk=list.get(c).getWaktuMasuk();
        int by=0;
        list.set(c, new kendaraan(plat,tanggal,waktuMasuk,waktuKeluar,by));
    }
    public void tambahParkir(String plat,String tanggal,int waktuMasuk,int waktuKeluar,int by){
        kendaraan motor=new kendaraan(plat,tanggal,waktuMasuk,waktuKeluar,by);
        list.add(motor);
    }
    
    //override
//    public int harga(String)
    
    public void ongkos(char karcis,int c,char stnk,int waktuKeluar){
        ongkosh=(list.get(c).getWaktuKeluar()-list.get(c).getWaktuMasuk())*5000;
        ongkosh=ongkosh+TAstnk(stnk);
        ongkosh=ongkosh+karcisHilang(karcis);
        int by=ongkosh;
         System.out.println("Bayar      = "+ongkosh+"\nHarap bayar dengan uang pas..!!!");
         String plat=list.get(c).getPlat();
        String tanggal=list.get(c).getTanggal();
        int waktuMasuk=list.get(c).getWaktuMasuk();
         list.set(c,new kendaraan(plat,tanggal,waktuMasuk,waktuKeluar,by));
    }
    
    public ArrayList<kendaraan>getALL(){
        return list;
    }
}
