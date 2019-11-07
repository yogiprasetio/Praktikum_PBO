/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasaslabm3;

/**
 *
 * @author yogi-06926
 */
public class sidoarjo extends biaya {
    int bayar=0;
    
    public void Duplikat(int Ktp){
         if(Ktp == 1){
            bayar= 560000;
        }
        else{
            bayar= 730000;
        }
    }
    
    public void gntPlat(int Ktp){
         if(Ktp == 1){
            bayar= 330000;
        }
        else{
            bayar= 625000;
        }
    }
    
    public void bbn1Wil(int Ktp){
       
         bayar = 500000;
        
    }
    
    public void bbn2Wil(int Ktp){
       
         bayar = 885000;
        
    }
    
    public void mutasi(){
        bayar = 1450000;
    }
    
    public int getBayar(){
        return bayar;
    }
}
