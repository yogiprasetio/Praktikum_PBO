package View_khisoft_projectm5;

import Logic_Khisoft_ProjectM5.Controller;
import Data_Khisoft_ProjectM5.Surat;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author yogi-06926
 */
public class Khisoft_ProjectM5 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Controller control = new Controller();
        char lanjuttt = 'y';
        do{
        boolean ulang = true;
        String judul,engirim,perihal,penerima,keterangan;
        int noSurat=0,jmlLamp;
        
        System.out.println("====================================================");
        System.out.println("=============== Khisoft Corporate ==================");
        System.out.println("Menu : ");
        System.out.println("1. Tambah data surat");
        System.out.println("2. cetak data surat");
        System.out.println("3. EXIT");
        System.out.println("====================================================");
        System.out.print("Pilih : ");
        int pilih=in.nextInt();
        switch(pilih){
            case 1 : 
                System.out.println("=================================================");
                System.out.println("Pilihan :");
                System.out.println("1. Surat Masuk");
                System.out.println("2. Surat Keluar");
                System.out.print("Pilihan : ");
                int pil=in.nextInt();
                if(pil == 1){
                    System.out.println("================================================");
                        System.out.println("Surat Masuk : ");
                do{
                    try{
                        
                        System.out.print("No Surat        : ");
                        noSurat = in.nextInt();
                        
                        ulang = false;
                        
                    }
                    catch (Exception ex){
                        System.err.println("Harap inputkkan Nomer surat dengan benar\n");
                        in.nextLine();
                    }
                    
                }while(ulang);
                System.out.print("Judul Surat     : ");
                        judul=in.next();
                        System.out.print("Pengirim         : ");
                        engirim=in.next();
                        System.out.print("Penerima          : ");
                        penerima = in.next();
                        System.out.print("Perihal           : ");
                        perihal = in.next();
                        System.out.println("Jumlah Lampiran     : ");
                        jmlLamp=in.nextInt();
                        control.tambahSurat(judul, engirim, penerima, perihal, noSurat, jmlLamp);
                }
                else if(pil == 2){
                    System.out.println("================================================");
                        System.out.println("Surat Masuk : ");
                    do{
                    try{
                        
                        System.out.print("No Surat        : ");
                        noSurat = in.nextInt();
                        ulang = false;  
                    }
                    catch (Exception ex){
                        System.err.println("Harap inputkkan Nomer surat dengan benar\n");
                        in.nextLine();
                    }
                    
                }while(ulang);
                    System.out.print("Judul Surat     : ");
                        judul=in.next();
                        System.out.print("Pengirim         : ");
                        engirim=in.next();
                        System.out.print("Penerima          : ");
                        penerima = in.next();
                        System.out.print("Perihal           : ");
                        perihal = in.next();
                        System.out.println("Jumlah Lampiran     : ");
                        jmlLamp=in.nextInt();
                        keterangan = "keluar";
                    control.tambahSurat(judul, engirim, penerima, perihal, noSurat, jmlLamp,keterangan);
                }
                else{
                    System.out.println("error...");
                }
                break;
                
            case 2 :
                System.out.println("=========================================================");
                System.out.println("pilihan : ");
                System.out.println("1. Cetak surat masuk");
                System.out.println("2. Cetak surat keluar");
                
                System.out.print("pilih : ");
                int pil2=in.nextInt();
                if(pil2 == 1){
                    for(Surat sur : control.getAll()){
                        if(sur.getKeterangan().equals("masuk")){
                            System.out.println("Nomor          : "+sur.getNoSurat());
                            System.out.println("Pengirim       : "+sur.getEngirim());
                            System.out.println("Perihal        : "+sur.getPrihal());
                            System.out.println("Judul          : "+sur.getJudulSurat());
                            System.out.println("Penerima       : "+sur.getPenerima());
                            System.out.println("Lampiran       : "+sur.getJmlLamp());
                            System.out.println("===================================================");
                        }
                    }
                }
                else if(pil2 == 2){
                    for(Surat sur : control.getAll()){
                        if(sur.getKeterangan().equals("keluar")){
                            System.out.println("Nomor          : "+sur.getNoSurat());
                            System.out.println("Pengirim       : "+sur.getEngirim());
                            System.out.println("Perihal        : "+sur.getPrihal());
                            System.out.println("Judul          : "+sur.getJudulSurat());
                            System.out.println("Penerima       : "+sur.getPenerima());
                            System.out.println("Lampiran       : "+sur.getJmlLamp());
                            System.out.println("===================================================");
                        }
                    }
                }
                break;
                
            case 3 :
                System.exit(0);
        }
        }while(lanjuttt == 'y');
    }
    
}
