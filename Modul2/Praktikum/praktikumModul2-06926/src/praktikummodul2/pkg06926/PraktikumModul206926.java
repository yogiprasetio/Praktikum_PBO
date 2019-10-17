package praktikummodul2.pkg06926;
import java.util.Scanner;
public class PraktikumModul206926 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nilai rapot=new Nilai();
        Scanner msuk=new Scanner(System.in);
        int b,c,D=0,men;
        char ljt;
        String a;
        do{
        System.out.println("==========E-Raport==========");
        System.out.println("Menu :");
        System.out.println("1. Input Data");
        System.out.println("2. Cetak Data");
        System.out.print("============================\nPilihan :");
        men=msuk.nextInt();
        switch(men){
            case 1:
                System.out.print("Berapa data yang akan di input :");
                men=msuk.nextInt();
                for(int i=0;i<men;i++){
                System.out.println("==========Input Data=========");
                System.out.print("Nama            : ");
                a=msuk.next();
                System.out.print("\nNilai IPA        : ");
                b=msuk.nextInt();
                System.out.print("\nNilai MATEMATIKA :");
                c=msuk.nextInt();
                D++;
                rapot.Tambah(rapot, a, b, c, D);
                }
                break;
            
            case 2:
                System.out.println("==========Tampil Data==========");
                rapot.cetak(rapot);
                System.out.println("===============================");
                break;
        }
            System.out.println("Apakah anda ingin keluar program?:");
            System.out.print("(Y/N) : ");
            ljt=msuk.next().charAt(0);
    }
   while(ljt=='n'||ljt=='N');
    
}
}
