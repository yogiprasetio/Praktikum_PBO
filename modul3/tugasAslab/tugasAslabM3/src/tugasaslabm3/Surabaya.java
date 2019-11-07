package tugasaslabm3;

/**
 *
 * @author yogi-06926
 */
public class Surabaya extends biaya {
//  private int herSTNK;
//  private int gantiPlat;
//  private int Duplikat;
    int bayar =0;
//    public void herStnk(int Ktp){
//       if(Ktp == 1){
//         bayar = getHerStnk()+50000;
//         setHerStnk(bayar);
//       }
//       else{
//           bayar = getHerStnk()+100000;
//           setHerStnk(bayar);
//       }
//    }
    
    public void gantiPlat(int Ktp){
        if(Ktp == 1){
            bayar= 340000;
        }
        else{
            bayar= 665000;
        }
    }
    
    public void Duplikat(int Ktp){
         if(Ktp == 1){
            bayar= 340000;
        }
        else{
            bayar= 665000;
        }
    }
    
    public void bbn1Wil(int Ktp){
         
            bayar= 485000;
        
    }
    
    public void bbn2Wil(int Ktp){
        
            bayar= 990000;
        
    }
   
    
    public int getBayar(){
        return bayar;
    }
}
