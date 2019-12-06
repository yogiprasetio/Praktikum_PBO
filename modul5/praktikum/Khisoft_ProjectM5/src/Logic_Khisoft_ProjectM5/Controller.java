package Logic_Khisoft_ProjectM5;

import Data_Khisoft_ProjectM5.Surat;
import java.util.ArrayList;

/**
 *
 * @author yogi-06926
 */
public class Controller {
    static ArrayList<Surat> list=new ArrayList<>();
   Surat surat=new Surat();
    
   public void tambahSurat(String judul,String engirim,String penerima,String perihal,int noSurat,int jmlLamp,String keterangan){
       surat.setEngirim(engirim);
       surat.setJmlLamp(jmlLamp);
       surat.setJudulSurat(judul);
       surat.setKeterangan(keterangan);
       surat.setNoSurat(noSurat);
       surat.setPenerima(penerima);
       surat.setPrihal(perihal);
       
       list.add(surat);
   }
   
    public void tambahSurat(String judul,String engirim,String penerima,String perihal,int noSurat,int jmlLamp){
        surat.setEngirim(engirim);
        surat.setJmlLamp(jmlLamp);
        surat.setJudulSurat(judul);
        surat.setNoSurat(noSurat);
        surat.setPrihal(perihal);
        surat.setPenerima(penerima);
        surat.setKeterangan("masuk");
        
        list.add(surat);
    }
    
    public ArrayList<Surat>getAll(){
        return list;
    }
    
}
