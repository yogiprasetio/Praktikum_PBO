package pkg06926.m4praktikum;

/**
 *
 * @author yogi-06926
 */
abstract class biaya {
    private int harga;
    
    biaya(){
        
    }
    
    private void setHarga(){
        harga = 5000;
    }
    
    final int karcisHilang(char karcis){
        if(karcis == 't'|| karcis=='T'){
            harga=harga+((harga*25)/100);
        }
        else{
            
        }
        return harga;
    }
    
    public int getHarga(){
        return harga;
    }
    
    final int TAstnk(char stnk){
        if(stnk == 't'||stnk=='T'){
            harga=harga+100000;
        }
        else{
            
        }
        return harga;
    }
}
