package PraktikumYogi_M1;

import java.util.Scanner;

/**
 *
 * @author yogi-06926
 */
public class Yogi_06926 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data data = new Data();
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
                c= data.Masuk();
                j++;
                break;
            
            case 2 :
                if(j==0){
                    System.out.println("sorry, Data not found");
                }
                else{
                c = data.Ascending();
                }break;
            
            case 3 :
                if(j==0){
                    System.out.println("sorry, Data not found");
                }
                else{
                c= data.Descending();
                }break;
            
            case 4 :
                if(j==0){
                    System.out.println("sorry, Data not found");
                }
                else{
                data.Cetak();
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
