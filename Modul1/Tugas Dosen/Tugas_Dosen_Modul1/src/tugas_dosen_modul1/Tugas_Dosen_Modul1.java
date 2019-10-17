package tugas_dosen_modul1;

import java.util.Scanner;

public class Tugas_Dosen_Modul1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TugasOvereading TO = new TugasOvereading();
        NyobaDosen nyobs = new NyobaDosen();
        int pil,pilM=0,b,m=0,v,bol=0;
        int i;
        double db;
        double f = 0.0;
        System.out.print("Masukkan Batas data\nBatas = ");
                i=input.nextInt();
        char ljt;
        do{
        System.out.println("==================================");
        System.out.println("Menu :");
        System.out.println("1. Tambah Data");
        System.out.println("2. Sorting Descending");
        System.out.println("3. Sorting Ascending");
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
                System.out.println("Tipe data yg dimasukkan\n1. bil bulat\n2. bil koma\n pil = ");
                bol=input.nextInt();
                if(bol==1){
                for(v=0;v<i;v++){
                    System.out.println("Data ke-"+v+"= ");
                    b=input.nextInt();
                    TO.input(v, b);
                    nyobs.input(v, b);
                    m++;
                }
                }
                else if(bol==2){
                    for(v=0;v<i;v++){
                    System.out.println("Data ke-"+v+"= ");
                    db=input.nextDouble();
                    TO.input(v,db);
                    nyobs.input(v, db);
                    m++;
                }
                }
                else{ System.out.println("invalid input");}
                break;
            
            case 2 :
                if(m==0){
                    System.out.println("sorry, Data not found");
                }
                else{
                System.out.println("Tentukan metode sorting.\n1. Bubble sort\n2. Selection sort\npil = ");
                pilM=input.nextInt();
                if(pilM==1){TO.ascending(i);TO.ascending(i,f);}
                else if(pilM==2){nyobs.ascending(i);nyobs.ascending(i,f);}
                else{ System.out.println("INPUT INVALID");}
                }break;
            
            case 3 :
                if(m==0){
                    System.out.println("sorry, Data not found");
                }
                else{
                System.out.println("Tentukan metode sorting.\n1. Bubble sort\n2. Selection sort\npil = ");
                pilM=input.nextInt();
                if(pilM==1){
                TO.descending(i);TO.descending(i,f);}
                else if(pilM==2){
                    nyobs.descending(i);
                    nyobs.descending(i,f);
                }
                else{ System.out.println("INPUT INVALID");}
                }break;
            
            case 4 :
                if(m==0){
                    System.out.println("sorry, Data not found");
                }
                else{
                if(bol==1){
                int[] a=TO.Cetak();
                int[] U=nyobs.Cetak();
                for(int z=0;z<i;z++){
                    if(pilM==1){
                    System.out.print("-> "+a[z]);}
                    else{
                        System.out.print("->"+U[z]);
                    }
                }}
                else if(bol==2){
                double[] d=TO.petak();
                double[] w=nyobs.petak();
                for(int z=0;z<i;z++){
                    if(pilM==1){
                    System.out.print("-> "+d[z]);}
                    else{
                        System.out.print("->"+w[z]);
                    }
                }}
                
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
