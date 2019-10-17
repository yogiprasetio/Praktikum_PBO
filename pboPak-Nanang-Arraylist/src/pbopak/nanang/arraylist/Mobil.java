package pbopak.nanang.arraylist;
import java.awt.Color;

class Mobil {
    public String merk;
    public Color warna;
    public int jmlRoda;
    
    public Mobil(String merk, Color warna){
        this.jmlRoda=4;
        this.merk=merk;
        this.warna = warna;
    }
    
    public String GetDetails(){
        return
                merk + ",warna = "+warna.getRed()+", Jumlah roda = "+jmlRoda;
    }
}
