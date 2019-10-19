package pkg06926pendahuluan;
import java.util.ArrayList;
import java.util.Scanner;

public class npm06926Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Pegawai> pegawaiArr=new ArrayList<>();
    static ArrayList<Pelanggan> pelangganArr=new ArrayList<>();
    static ArrayList<Cucian> cucianArr=new ArrayList<>();
    public static void main(String[] args) {
        int menu;
        do {
            npm06926Main main;
            main = new npm06926Main();
            System.out.println("\n\nSistem Informasi Laundry RPL!!!");
            main.tampilkanData();
            System.out.println("\n\nMenu");
            System.out.println("1. Tambah Kasir");
            System.out.println("2. Tambah Pelanggan");
            System.out.println("3. Tambah Transaksi");
            System.out.println("0. Selesai");
            System.out.print("Masukkan Nomor Menu : ");
            menu = scan.nextInt();
            switch (menu){
                case 1 :
                    main.tambahKasir();
                    break;
                case 2:
                    main.tambahPelanggan();
                    break;
                case 3 :
                    main.tambahCucian();
                    break;
                default :
                    menu = 0;
                    System.out.println("Terimakasih telah menggunakan sistem informasi laundry RPL!!!");
            }
        }
        while(menu != 0);
    }
    static void tampilkanData(){
        System.out.println("\n\nData Pegawai");
        for(int i=0;i<pegawaiArr.size();i++){
            System.out.println("ID Pegawai      : "+pegawaiArr.get(i).getid()+", Nama : "+pegawaiArr.get(i).getNama()+", No HP : "+pegawaiArr.get(i).getNohp());
        }
        System.out.println("\n\nData Pelanggan : ");
        for(int i=0;i<pelangganArr.size();i++){
            System.out.println("ID Pelanggan : "+pelangganArr.get(i).getId()+"Nama : "+pelangganArr.get(i).getNama()+", NO HP : "+pelangganArr.get(i).getNohp());
        }
        System.out.println("\n\nData Cucian : ");
        for(int i=0;i<cucianArr.size();i++){
            System.out.println("Nama Pegawai : "+cucianArr.get(i).getPegawai().getNama()+"Nama Pelanggan : "+cucianArr.get(i).getPelanggan().getNama()+", Berat : "+cucianArr.get(i).getBerat()+" KG, Harga total cucian : "+cucianArr.get(i).getHargaTotal());
        }
    }
    static void tambahKasir(){
        System.out.println("Tamba Data Pegawai !!!");
        Pegawai pegawai =new Pegawai();
        System.out.println("ID Pegawai : "+String.valueOf(pegawaiArr.size()+1));
        pegawai.setid(pegawaiArr.size()+1);
        System.out.println("Nama Pegawai : ");
        pegawai.setNama(scan.next());
        System.out.println("Kata sandi Pegawai : ");
        pegawai.setKataSandi(scan.next());
        System.out.println("Nomor HP Pegawai : ");
        pegawai.setNohp(scan.next());
        pegawaiArr.add(pegawai);
}
static void tambahPelanggan(){
    System.out.println("Tambah Pelanggan !!!");
    Pelanggan pelanggan = new Pelanggan();
    System.out.println("ID Pelanggan : "+String.valueOf(pelangganArr.size()+1));
    pelanggan.setId(pelangganArr.size()+1);
    System.out.println("Nama Pelanggan : ");
    pelanggan.setNama(scan.next());
    System.out.println("Nomor HP Pelanggan : ");
    pelangganArr.setNohp(scan.next());
    
    pelangganArr.add(pelanggan);
    
}
static void tambahCucian(){
    System.out.println("Tambah Data Cucian!");
    Cucian cucian = new Cucian();
    System.out.print("ID Pegawai : ");
    cucian.setPegawai(pegawaiArr.get(scan.nextInt()-1));
    System.out.println("ID Pelanggan : ");
    cucian.setPelanggan(pelangganArr.get(scan.nextInt()-1));
    System.out.println("Berat cucian (KG): ");
    cucian.setBerat(scan.nextFloat());
    System.out.println("Harga totalnya adalah : Rp."+cucian.getHargaTotal());
    cucianArr.add(cucian);
}
}
