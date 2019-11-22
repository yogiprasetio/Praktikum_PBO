package pkg06926Mdl5mainMain;
import pengguna.*;
import transaksi.Cucian;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    static Scanner scan=new Scanner(System.in);
    static ArrayList<Pegawai> pegawaiArr=new ArrayList<>();
    static ArrayList<Pelanggan> pelangganArr=new ArrayList<>();
    static ArrayList<Cucian> cucianArr=new ArrayList<>();
    
    public static void main(String[] args) {
        
        int menu;
        do
        {
            System.out.println("\n\n Sistem Informasi Laundry RPL!!!");
            Main.tampilkanData();
            
            System.out.println("\n\n Menu : ");
            System.out.println(" 1. Tambah Kasir");
            System.out.println(" 2. Tambah Pelanggan");
            System.out.println(" 3. Tambah Transaksi Cucian");
            System.out.println(" 0. Selesai");
            System.out.print(" Masukkan nomor menu : ");
            menu=scan.nextInt();
            
            switch(menu)
            {
                case 1 :
                    Main.tambahKasir();break;
                case 2 :
                    Main.tambahPelanggan();break;
                case 3 :
                    Main.tambahCucian();break;
                default :
                    menu = 0;
                    System.out.println(" Terima kasih telah menggunakan Sistem Informasi Laundry RPL!!!");
            }
        }while(menu !=0);
        
    }
    
    static void tampilkanData()
    {
        System.out.println("\n\n Data Pegawai  : ");
        for(int i=0; i<pegawaiArr.size(); i++)
        {
            pegawaiArr.get(i).print();
        }
        System.out.println("\n\n Data Pelanggan : ");
        for(int i=0; i<pelangganArr.size(); i++)
        {
            pelangganArr.get(i).print();
        }
        System.out.println("\n\n Data Cucian    : ");
        for(int i=0; i<cucianArr.size(); i++)
        {
            cucianArr.get(i).print();
        }
    }
    
    static void tambahKasir()
    {
        System.out.println(" Tambah data pegawai!");
        Pegawai pegawai=new Pegawai();
        
        System.out.println(" ID PEGAWAI : "+String.valueOf(pegawaiArr.size()+1));
        pegawai.setId(pegawaiArr.size()+1);
        System.out.print(" Nama Pegawai       : ");
        pegawai.setNama(scan.next());
        System.out.print(" Kata Sandi Pegawai : ");
        pegawai.setKataSandi(scan.next());
        System.out.print(" Nomor HP Pegawai   : ");
        pegawai.setNoHp(scan.next());
        pegawaiArr.add(pegawai);
    }
    
    static void tambahPelanggan()
    {
        System.out.println(" Tambah data pelanggan!");
        Pelanggan pelanggan=new Pelanggan();
        
        System.out.println(" ID PELANGGAN : "+String.valueOf(pelangganArr.size()+1));
        pelanggan.setId(pelangganArr.size()+1);
        System.out.print(" Nama Pelanggan       : ");
        pelanggan.setNama(scan.next());
        System.out.print(" Nomor HP Pelanggan   : ");
        pelanggan.setNoHp(scan.next());
        pelangganArr.add(pelanggan);
    }
    
    static void tambahCucian()
    {
        System.out.println(" Tambah data Cucian!");
        Cucian cucian=new Cucian();
        
        System.out.print(" ID Pegawai       : ");
        cucian.setPegawai(pegawaiArr.get(scan.nextInt()-1));
        System.out.print(" ID Pelanggan     : ");
        cucian.setPelanggan(pelangganArr.get(scan.nextInt()-1));
        System.out.print(" Berat Cucian (KG): ");
        cucian.getHargaTotal(scan.nextFloat());
        cucianArr.add(cucian);
    }
    
}
