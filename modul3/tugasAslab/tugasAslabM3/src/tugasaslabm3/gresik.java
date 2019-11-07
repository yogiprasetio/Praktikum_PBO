package tugasaslabm3;

/**
 *
 * @author yogi-06926
 */
public class gresik extends biaya{
    private int bayar=0;
    
    public void gntPlat(int Ktp){
         if(Ktp == 1){
            bayar= 360000;
        }
        else{
            bayar= 640000;
        }
    }
    
    public void duplikat(int Ktp){
         if(Ktp == 1){
            bayar= 560000;
        }
        else{
            bayar= 730000;
        }
    }
    
    public void bbn1Wil(int Ktp){
       
         bayar = 500000;
    }
    
    public void mutasi(){
        bayar =  1450000;
    }
    
    public int getBiaya(){
        return bayar;
    }
    
}
