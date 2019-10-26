package npm06926praktikummodul3;
import java.util.Scanner;
public class Npm06926praktikummodul3 {

    public static void main(String[] args) {
        Scanner inn=new Scanner(System.in);
        controlnya stick = new controlnya();
        int pil,c=0;
        char ljt;
        String a, b,it;
        do{
        System.out.println("=============Program Lupa Cara-Cari===============");
        System.out.println("Menu : \n1. Inputkan Data\n2. Search Binnary\n3. Search Sequential\n4. Cetak dong");
        System.out.println("==================================================");
        System.out.print("Pilihan : ");pil=inn.nextInt();
        
      switch(pil){
          case 1 :
              System.out.println("======== Input Data ======");
              System.out.println("Nama      : ");
              a=inn.next();
              System.out.println("NIK       : ");
              b=inn.next();
              c++;
              stick.entri(a, b, c);
              System.out.println("Data input success...");
              break;
          case 2 :
              System.out.println("======= Search Binnary =======");
              System.out.println("Masukkan kata kunci : ");
              it=inn.next();
              stick.binnaryS(it);
              break;
          case 3 :
              System.out.println("======= Search Binnary =======");
              System.out.println("Masukkan kata kunci : ");
              it=inn.next();
              stick.SequentialSearch(it);
              break;
          case 4 :
              System.out.println("=========== Cetak Data ===========");
                for(Orang baru : stick.getList()){
                    System.out.println("Isi array : " + stick.getList().size());
                    System.out.println("Nama             : "+ baru.getNama());
                    System.out.println("Nik        : "+ baru.getNIK());
                    System.out.println("Antrian : "+ baru.antri);
                    System.out.println("------------------------------");
                }
                System.out.println("==================================");
              break;
      }
        System.out.print("\napakah anda ingin keluar program?\n(Y/N) = ");
        ljt = inn.next().charAt(0);
    }
        while(ljt == 'n'|| ljt == 'N');
}
    }
    

