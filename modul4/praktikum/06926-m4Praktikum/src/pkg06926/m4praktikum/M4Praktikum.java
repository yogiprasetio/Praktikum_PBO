package pkg06926.m4praktikum;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author yogi-06926
 */
public class M4Praktikum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        LocalTime time= LocalTime.now();
        LocalDate date = LocalDate.now();
        controller control=new controller();
        String plat;
        String tanggal;
        int waktuMasuk;
        int waktuKeluar;
        int by,c=0;
        char stnk,karcis,ljt='y';
        int menu;
        do{
//        System.out.println(tanggal);
        System.out.println("=================================================");
        System.out.println("============= PT.Go Clean Indonesia =============");
        System.out.println("================= Parking System ================");
        System.out.println("|| 1. Motor Masuk                              ||");
        System.out.println("|| 2. Motor Keluar                             ||");
        System.out.println("|| 3. EXIT                                     ||");
        System.out.println("=================================================");
        System.out.print("Pilihan : ");
        menu=in.nextInt();
        switch(menu){
            case 1 :
                System.out.println("=================================================");
                System.out.println("============= PT.Go Clean Indonesia =============");
                System.out.println("================= Parking System ================");
                System.out.println("Motor masuk : ");
                System.out.print("PLAT NO           : ");
                plat=in.next();
                tanggal=date.toString();
                System.out.println("Tanggal           : "+tanggal);
                waktuMasuk= time.getHour();
                int min = time.getMinute();
                System.out.println("Waktu IN (24 hour): "+waktuMasuk+"."+min);
                waktuKeluar=time.getHour();
                by=0;
                control.tambahParkir(plat, tanggal, waktuMasuk, waktuKeluar, by);
                break;
                
            case 2 :
                System.out.println("=================================================");
                System.out.println("============= PT.Go Clean Indonesia =============");
                System.out.println("================= Parking System ================");
                for(kendaraan mtr:control.getALL()){
                System.out.println("index = "+c+" plat = "+mtr.getPlat());
                c++;
                }
                System.out.println("-------------------------------");
                System.out.print("Motor keluar (index ke): ");
                c=in.nextInt();
                waktuKeluar=time.getHour();
                min=time.getMinute();
                System.out.println("Waktu pukul (24 hour)  : "+waktuKeluar+"."+min);
                control.tambahParkir(c, waktuKeluar);
                System.out.println("=================================================");
                System.out.println("keterangan : ");
                System.out.print("Karcis (Y/T)  = ");
                karcis=in.next().charAt(0);
                System.out.print("STNK (Y/T)    = ");
                stnk=in.next().charAt(0);
                control.ongkos(karcis, c, stnk, waktuKeluar);
                break;
                
            case 3 :
                System.out.print("bye.......");
                int sure = 0;
                System.exit(sure);
                break;
        }
        
    }
    while(ljt == 'y');
}
}
