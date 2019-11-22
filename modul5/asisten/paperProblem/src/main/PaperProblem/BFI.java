package main.PaperProblem;
import java.util.Scanner;
import java.util.Date;

public class BFI {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Date waktu1=new Date();
        int menu,saldo;
        int l=0;
        char lanjut='y';
        Controller control=new Controller();
        do{
            System.out.println("================================================");
            System.out.println("============== Management Kertas ===============");
            System.out.println("menu : ");
            System.out.println("1. Ambil kertas");
            System.out.println("2. Re-Stock Kertas");
            System.out.println("3. List Konsumsi Kertas");
            System.out.println("4. List Re-stock");
            System.out.println("5. EXIT");
            System.out.println("================================================");
            System.out.print("Pilihan : ");menu=in.nextInt();
            switch(menu){
                case 1 :
                    System.out.println("================================================");
                    System.out.print("Nama     : ");String nama=in.next();
                    System.out.print("Jabatan  : ");String jabatan=in.next();
                    System.out.print("Departemen : ");String departemen=in.next();
                    System.out.print("Tujuan     : ");String tujuan=in.next();
                    String ukuran = "A4";
                    String waktu=waktu1.toString();
                    System.out.print("Waktu      : "+waktu);
                    if(l==1){
                    saldo=control.listkertas.get((l-1)).getSaldo();
                    }
                    else{
                    int s=control.list.size();
                    saldo=control.list.get(s).ppr.getSaldo();
                    }
                    System.out.println("Saldo Akhir : "+saldo);
                    System.out.print("Ambil berapa : ");
                    int debet=in.nextInt();
                    control.tambahList(nama, jabatan, departemen, tujuan, tujuan, saldo, debet, waktu);
                    System.out.println("Data has been saved, please use paper to good working.\nThanks Great people...");
                    break;
                    
                case 2 :
                    if(l==0){
                        l=l+1;
                    System.out.println("================================================");
                    System.out.print("Nama  : ");nama=in.next();
                    saldo=0;
                    System.out.println("Saldo : "+saldo);//saldo=in.nextInt();//ambil dari arraylist kertas
                    System.out.print("Debet : ");debet=in.nextInt();
                    waktu = waktu1.toString();
                    System.out.println("Waktu : "+waktu);
                    control.tambahList(nama, saldo, debet, waktu);
                    System.out.println("Great people....");
                    }
                    else{
                        System.out.println("================================================");
                    System.out.print("Nama  : ");nama=in.next();
                    saldo=control.list.get(l).ppr.getSaldo();
                    System.out.print("Saldo : "+saldo);//saldo=in.nextInt();//ambil dari arraylist kertas
                    System.out.print("Debet : ");debet=in.nextInt();
                    waktu = waktu1.toString();
                    System.out.print("Waktu : "+waktu);
                    control.tambahList(nama, saldo, debet, waktu);
                    System.out.println("Great people....");
                    }
                    
                    break;
                    
                case 3 :
                    System.out.println("================================================");
                    System.out.println("List Pengambil Kertas : ");
                    for(Departement div : control.getALL()){
                        System.out.println("Departemen : "+div.getNamaDepartment());
                        System.out.println("Nama       : "+div.man.getNama());
                        System.out.println("Tujuan     : "+div.getTujuan());
                        System.out.println("Debet      : "+div.ppr.getDebet());
                        System.out.println("Tanggal    : "+div.ppr.waktu);
                        System.out.println("================================================");
                    }
                    break;
                    
                case 4 :
                    System.out.println("================================================");
                    System.out.println("List Re-Stock ; ");
                    for(kertas kts : control.tampil()){
                        System.out.println("Tanggal : "+kts.waktu);
                        System.out.println("Nama    : "+kts.men.getNama());
                        System.out.println("Debet in: "+kts.getDebet());
                        System.out.println("================================================");
                    }
                    break;
                    
                case 5 :
                    System.out.println("BYE......");
                    System.exit(0);
            }
            
        }
        while(lanjut=='y');
    }
    
}
