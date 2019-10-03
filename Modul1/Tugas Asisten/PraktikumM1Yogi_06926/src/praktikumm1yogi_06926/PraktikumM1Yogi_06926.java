package praktikumm1yogi_06926;

import java.util.Scanner;

public class PraktikumM1Yogi_06926 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil, j = 0, i = 0, d = 0;
        Data data = new Data();
        char ljt;
        do {
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
            if (pil > 4 || pil < 1) {
                System.out.println("Inputan salah!!!");
            } else {
                switch (pil) {
                    case 1:
                        for (i = 0; i < 5; i++) {
                            System.out.print("Masukkan angka Ke-"+(i+1)+" = ");
                            j= input.nextInt();
                            data.Masuk(j);
                        }
                        break;

                    case 2:
                        data.Ascending();
                        break;

                    case 3:
                        data.Descending();
                        break;

                    case 4:
                        int[] c= data.Cetak();
                        for(i=0;i<5;i++){
                            System.out.print(c[i]);
                        }
                        break;
                }
            }
            //tempat else
            System.out.print("\napakah anda ingin keluar program?\n(Y/N) = ");
            ljt = input.next().charAt(0);
        } while (ljt == 'n' || ljt == 'N');
    }
}
