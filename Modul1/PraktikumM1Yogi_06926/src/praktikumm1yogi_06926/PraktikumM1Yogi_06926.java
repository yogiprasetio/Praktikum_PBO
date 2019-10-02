package praktikumm1yogi_06926;
import java.util.Scanner;

public class PraktikumM1Yogi_06926 {
   

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data Data = new Data();
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
                c= Data.Masuk();
                j++;
                break;
            
            case 2 :
                if(j==0){
                    System.out.println("sorry, Data not found");
                }
                else{
                c = Data.Ascending();
                }break;
            
            case 3 :
                if(j==0){
                    System.out.println("sorry, Data not found");
                }
                else{
                c= Data.Descending();
                }break;
            
            case 4 :
                if(j==0){
                    System.out.println("sorry, Data not found");
                }
                else{
                Data.Cetak();
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
