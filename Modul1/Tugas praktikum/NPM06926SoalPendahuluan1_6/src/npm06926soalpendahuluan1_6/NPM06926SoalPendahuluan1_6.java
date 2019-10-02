package npm06926soalpendahuluan1_6;
import java.util.Scanner;
import static npm06926soalpendahuluan1_6.Menu.Menu;
import static npm06926soalpendahuluan1_6.FungsiLingkaran.FungsiLingkaran;
import static npm06926soalpendahuluan1_6.FungsiLuasLingkaran.FungsiLuasLingkaran;
import static npm06926soalpendahuluan1_6.FungsiTabung.FungsiTabung;
import static npm06926soalpendahuluan1_6.ProcedureLuasLingkaran.ProcedureLuasLingkaran;
public class NPM06926SoalPendahuluan1_6 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan Diameter (meter) : ");
        double Diameter = Input.nextDouble();
        Menu();
        System.out.print("Masukkan Pilihan : ");
        int Pil = Input.nextInt();
        switch(Pil){
            case 1 :
                ProcedureLuasLingkaran(Diameter);
                break;
            case 2 :
                double Luas = FungsiLuasLingkaran(Diameter);
                System.out.println("Luas Lingkaran = "+Luas);
                break;
            case 3 :
                double[] Hasil = FungsiLingkaran(Diameter);
                System.out.println("Luas Lingkaran Adalah = "+Hasil[0]);
                System.out.println("Keliling Lingkaran Adalah = "+Hasil[1]);
                break;
            case 4 :
                System.out.print("Masukkan Tinggi (Meter) : ");
                int Tinggi=Input.nextInt();
                double Volume = FungsiTabung(Diameter,Tinggi);
                double Konversi = Volume*100;
                System.out.println("Volume Tabung adalah : "+Konversi+"(Cm^3)");
                break;
        }
    }

    
}
