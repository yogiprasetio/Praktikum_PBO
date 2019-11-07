package tugasaslabm3;
import java.util.ArrayList;
/**
 *
 * @author yogi-06926
 */
public class kompiller {
    ArrayList<konsumen> list;
    gresik grs=new gresik();
    Surabaya sby=new Surabaya();
    sidoarjo sda=new sidoarjo();
    biaya by=new biaya();
    
    kompiller(){
        list=new ArrayList<>();
    }
    
    public void data(String nama, String noKontrak,String kendaraan,String type,int tahun,int pajak,int her,int gntp,int dplk,int bbn,int mts){
        konsumen kons=new konsumen(nama,noKontrak,kendaraan,type,tahun,pajak,her,gntp,dplk,bbn,mts);
        list.add(kons);
    }
    
    public void delete(int d){
        list.remove(d);
    }
    
    public ArrayList<konsumen>getALL(){
        return list;
    }
    
//    public void updateHitungPajak(){
//        
//    }
    
    public void update(int pil,String nama, String noKontrak,String kendaraan,String type,int tahun,int pajak,int her,int gntp,int dplk,int bbn,int mts){
        list.set(pil, new konsumen(nama,noKontrak,kendaraan,type,tahun,pajak,her,gntp,dplk,bbn,mts));
    }
    
}
