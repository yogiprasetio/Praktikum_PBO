package npm06926soalpendahuluan1_6;

public class FungsiLingkaran {
    static double[] FungsiLingkaran(double Diameter){
        double[] Hasil = new double[2];
        double Jari = Diameter/2;
        double Luas = Jari*3.14*3.14;
        double Keliling=Jari*2*3.14;
        Hasil[0]=Luas;
        Hasil[1]=Keliling;
        return Hasil;
    }
}
