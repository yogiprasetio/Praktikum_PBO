package tugasaslabm2_arraylist;
import java.util.Scanner;
public class TugasAslabM2_ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Controller control=new Controller();
        int a,b,c,d,pil;
        char ljt;
        String name;
        do{
        System.out.println("=========== Rapot E-Link ==========");
        System.out.println("Menu :");
        System.out.println("1. Tambah Data");
        System.out.println("2. Cetak Data");
        System.out.println("3. Update Data");
        System.out.println("4. Delete Data");
        System.out.println("===================================");
        System.out.print("Pilihan = ");
        pil=in.nextInt();
        switch(pil){
            case 1 :
                System.out.println("==========Input Data=========");
                System.out.print("Nama             : ");
                name=in.next();
                System.out.print("\nNilai IPA        : ");
                a=in.nextInt();
                System.out.print("\nNilai MATEMATIKA : ");
                b=in.nextInt();
                control.insert(name, a, b);
                System.out.println("==============================");
                break;
            case 2 :
                System.out.println("=========== Cetak Data ===========");
                for(Data nilai : control.getALL()){
                    System.out.println("Nama             : "+nilai.getNamas());
                    System.out.println("Nilai IPA        : "+nilai.getNipa());
                    System.out.println("Nilai Matematika : "+nilai.getNikmat());
                    System.out.println("------------------------------");
                }
                System.out.println("==================================");
                break;
                
            case 3 :
                d=1;
                System.out.println("=========== Update Data ==========");
                System.out.println("=========== LIST ===========");
                for(Data nilai : control.getALL()){
                    System.out.println("Index            : "+(d-1));d++;
                    System.out.println("Nama             : "+nilai.getNamas());
                    System.out.println("Nilai IPA        : "+nilai.getNipa());
                    System.out.println("Nilai Matematika : "+nilai.getNikmat());
                    System.out.println("------------------------------");
                }
                System.out.println("==================================");
                System.out.println("Masukkan index data yang akan anda update..");
                System.out.print("Index : ");
                c=in.nextInt();
                System.out.println("Update...\nnama : ");
                name=in.next();
                System.out.println("Nilai IPA :");
                a=in.nextInt();
                System.out.println("Nilai Matematika : ");
                b=in.nextInt();
                System.out.println("Are You Sure Update data (1/0)???");
                pil=in.nextInt();
                if(pil==1){
                control.update(c,name,a,b);}
                else{
                    
                }
                break;
                
            case 4 :
                
                System.out.println("=========== Delete Data ==========");
                System.out.println("=========== LIST ===========");
                d=0;
                for(Data nilai : control.getALL()){
                    System.out.println("Index            : "+d);d++;
                    System.out.println("Nama             : "+nilai.getNamas());
                    System.out.println("Nilai IPA        : "+nilai.getNipa());
                    System.out.println("Nilai Matematika : "+nilai.getNikmat());
                    System.out.println("------------------------------");
                }
                System.out.println("==================================");
                
                System.out.println("\nMasukkan Nama siswa yang ingin di hapus");
                System.out.print("Index : ");
                d=in.nextInt();
                System.out.println("Are You Sure (1/0)???");
                pil=in.nextInt();
                if(pil==1){
                control.delete(d);}
                else{
                    
                }
                break;
              
                
            }
        System.out.println("Apakah anda ingin keluar program? (Y/N)");
        ljt=in.next().charAt(0);
        }
   while(ljt=='n'||ljt=='N');
        
    }
}
