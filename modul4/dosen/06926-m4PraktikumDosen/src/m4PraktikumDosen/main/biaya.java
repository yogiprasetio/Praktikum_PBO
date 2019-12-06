package m4PraktikumDosen.main;

/**
 *
 * @author yogi-06926
 */
abstract class biaya {
    int harga;
    
   
   
    
    abstract void karcisHilang(char karcis);
    
//    final int karcisHilang(char karcis){
//        if(karcis == 't'|| karcis=='T'){
//            harga=harga+((harga*25)/100);
//        }
//        else{
//            
//        }
//        return harga;
//    }
    
//    public int getHarga(){
//        return harga;
//    }
    
    abstract void TAstnk(char stnk);
    
//    final int TAstnk(char stnk){
//        if(stnk == 't'||stnk=='T'){
//            harga=harga+100000;
//        }
//        else{
//            
//        }
//        return harga;
//    }
}
