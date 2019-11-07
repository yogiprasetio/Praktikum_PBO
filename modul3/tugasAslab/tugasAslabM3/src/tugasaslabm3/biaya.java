package tugasaslabm3;

/**
 *
 * @author yogi-06926
 */
public class biaya {
private int Ktp;
//private int bayar;
private int pajak;
private int terbitStnk = 100000;
private int terbitTNKB = 60000;
private int terbitBPKB = 225000;
private int herStnk=0,gntPlat=0,duplikat=0,bbn1Wl=0,bbn2Wl=0,mutasi=0;

public void setPajak(int pajak,int telat){
    if(telat!=0){
        this.pajak=(((pajak*25)%100)*12)+(pajak*telat);
    }
    else{
        this.pajak=pajak;
    }
}

//public void setHerStnk(int Ktp){
//    this.herStnk=bayar;
//}
public void setGntPlat(int bayar){
    this.gntPlat=bayar;
}

public void setDuplikat(int bayar){
    this.duplikat=bayar;
}

public void setbbn1Wl(int bayar){
    this.bbn1Wl=bayar;
}

public void setBbn2Wl(int bayar){
    this.bbn2Wl=bayar;
}

public void setMutasi(int bayar){
    this.mutasi=bayar;
}

public int getTerbitStnk(){
    return terbitStnk;
}
public int getTerbitBpkb(){
    return terbitBPKB;
}
public int getTerbitTnkb(){
    return terbitTNKB;
}
public int getHerStnk(){
    return herStnk;
}
public int getGntPlat(){
    return gntPlat;
}
public int getDuplikat(){
    return duplikat;
}
public int getBbn1Wl(){
    return bbn1Wl;
}
public int getBbn2Wl(){
    return bbn2Wl;
}
public int getMutasi(){
    return mutasi;
}

public int getPajak(){
    return pajak;
}

public void herStnk(int Ktp){
       if(Ktp == 1){
           this.herStnk = 50000;
//         setHerStnk(Ktp);
       }
       else{
           this.herStnk = 100000;
//           setHerStnk(Ktp);
       }
    }

}
