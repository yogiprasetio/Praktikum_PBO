package tugas_dosen_modul1;

import java.util.Scanner;

/**
 *
 * @author yogi-06926
 */
public class Tugas_Dosen_Modul1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TugasOvereading TugasOvereading = new TugasOvereading();
        int pil, j=0, z;
        int[]c = new int[10];
        char ljt;
        do{
        System.out.println("==================================");
        System.out.println("Menu :");
        System.out.println("1. Tambah Data");
        System.out.println("2. Sorting Ascending");
        System.out.println("3. Sorting Descending");
        System.out.println("4. Tampilkan Data");
        System.out.println("==================================");
        System.out.println("Masukkan Pilihan Anda..");
        System.out.print("Pilihan = ");
        pil = input.nextInt();
        //disini if
        if(pil>4 || pil<1){
            System.out.println("Inputan salah!!!");
        }
        else{
        switch(pil){
            case 1 :
                c= TugasOvereading.Masuk();
                j++;
                break;
            
            case 2 :
                if(j==0){
                    System.out.println("sorry, Data not found");
                }
                else{
                c = TugasOvereading.Ascending();
                }break;
            
            case 3 :
                if(j==0){
                    System.out.println("sorry, Data not found");
                }
                else{
                c= TugasOvereading.Descending();
                }break;
            
            case 4 :
                if(j==0){
                    System.out.println("sorry, Data not found");
                }
                else{
                TugasOvereading.Cetak();
                }break;
            }
        }
        //tempat else
        System.out.print("\napakah anda ingin keluar program?\n(Y/N) = ");
        ljt = input.next().charAt(0);
        }
        while(ljt == 'n'|| ljt == 'N');
    
    }
    
}
