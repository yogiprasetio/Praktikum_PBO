package pbopak.nanang.arraylist;
import java.awt.Color;
import java.util.ArrayList;

public class PboPakNanangArraylist {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Color warna = new Color(173, 37, 37);
        //1   //2
       
        //Mobil bmw = new Mobil("BMW", warna);  // konstruksi
       
                       // ^ method constructor
//        bmw.merk = "BMW";
//        bmw.warna = ;
 
        // array
//        Mobil[] listMobil = new Mobil[100];
// 
//        for (int i = 0; i < 100; i++) {
//            Color warnaX = new Color((173 + (i*10)) % 256, 37, 37);
//            Mobil mobil = new Mobil("BMW " + (i+1), warnaX);
// 
//            listMobil[i] = mobil;
//        }
// 
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Mobil ke-" + (i+1) + " = " +
//                 listMobil[i].GetDetails());
//        }
 
        System.out.println("\n=============================\n");
       
        ArrayList<Mobil> arrayListMobil = new ArrayList<>();
 
        for (int i = 0; i < 101; i++) {
            Color warnaX = new Color((173 + (i*10)) % 256, 37, 37);
            Mobil mobil = new Mobil("BMW " + (i+1), warnaX);
//            mobil.merk = ;
//            mobil.warna = new Color((173 + (i*10)) % 256, 37, 37);
 
            arrayListMobil.add(mobil);
        }
 
        for (int i = 0; i < 101; i++) {
            System.out.println("Mobil ke-" + (i+1) + " = " +
                 arrayListMobil.get(i).GetDetails());
        }
 
        // String[] daftarNama = new String[15];
        // daftarNama[0] = "Coba saja";
 
        // System.out.println(daftarNama[0]);
    }
}
