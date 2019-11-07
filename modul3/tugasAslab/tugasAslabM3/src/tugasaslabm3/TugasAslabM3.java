package tugasaslabm3;
import java.util.Scanner;

public class TugasAslabM3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        kompiller komp=new kompiller();
        gresik grs=new gresik();
        Surabaya sby=new Surabaya();
        sidoarjo sda=new sidoarjo();
        biaya by=new biaya();
        String nama,noKontrak,kendaraan,type,asal,tujuan;
        int tahun,pajak=0,telat,dp;
        int Ktp = 0,pil,her=0,gntp=0,dplk=0,bbn=0,mts=0;
        char ljt;
        do{
        String Kendaraan;
        System.out.println("========== Perhitungan Pengurusan BFI ==========");
        System.out.println("1. Tambah Konsumen");
        System.out.println("2. Lihat Data Konsumen");
        System.out.println("3. Hapus Data Konsumen");
        System.out.println("4. Hitung Pajak Konsumen");
        System.out.println("================================================");
        System.out.print("Pilihan : ");
        pil=in.nextInt();
        switch(pil){
            case 1 :
                System.out.println("=============input data konsumen============");
                System.out.print("Nama : ");
                nama=in.next();
                System.out.print("No Kontrak : ");
                noKontrak=in.next();
                System.out.print("Kendaraan (motor/mobil) : ");
                kendaraan=in.next();
                System.out.print("type/merk : ");
                type=in.next();
                System.out.print("Tahun : ");
                tahun=in.nextInt();
                komp.data(nama, noKontrak, kendaraan, type, tahun,pajak, her, gntp, dplk, bbn, mts);
                System.out.println("Data Has been saved...");
                break;
                
            case 2 :
                System.out.println("===============List Konsumen================");
                for(konsumen kons: komp.getALL()){
                System.out.println("Nama : "+kons.getNama());
                
                System.out.println("No Kontrak : "+kons.getNoKontrak());
                
                System.out.println("Kendaraan (motor/mobil) : "+kons.unt.getKendaraan());
                
                System.out.println("type/merk : "+kons.unt.getType());
                
                System.out.println("Tahun : "+kons.unt.getTahun());
                    System.out.println("Pajak = "+kons.pajak);
                    System.out.println("BBN = "+kons.bbn);
                    System.out.println("Ganti plat = "+kons.gntp);
                    System.out.println("Her STNK = "+kons.her);
                    System.out.println("Mutasi = "+kons.mts);
                    System.out.println("--------------------------------------- +");
                    System.out.println("Total = "+kons.total);
                    System.out.println("===========================================");
                }
                break;
                
            case 3 :
                System.out.println("=========== Delete Data ==========");
                System.out.println("=========== LIST ===========");
                int d=0;
                for(konsumen kons : komp.getALL()){
                    System.out.println("No Kontrak : "+kons.getNoKontrak());
                
                System.out.println("Kendaraan (motor/mobil) : "+kons.unt.getKendaraan());
                
                System.out.println("type/merk : "+kons.unt.getType());
                
                System.out.println("Tahun : "+kons.unt.getTahun());
                    System.out.println("===========================================");
                }
                System.out.println("==================================");
                
                System.out.println("\nMasukkan Nama konsumen yang ingin di hapus");
                System.out.print("Index : ");
                d=in.nextInt();
                System.out.println("Are You Sure (1/0)???");
                pil=in.nextInt();
                if(pil==1){
                komp.delete(d);}
                else{
                    
                }
                break;
        
            case 4 :
                System.out.println("================== Hitung Pajak ===================");
                System.out.print("Pajak Kendaraan = ");
                pajak=in.nextInt();
                System.out.print("Telat (tahun) = ");
                        telat=in.nextInt();
                System.out.print("KTP (1=ADA|2=TDK ADA) = ");
                Ktp=in.nextInt();
                by.setPajak(pajak, telat);
                pajak=by.getPajak();
                System.out.println("Pilihan Pengurusan : ");
                System.out.println("1. Her Stnk");
                System.out.println("2. Ganti Plat");
                System.out.println("3. Duplikat STNK");
                System.out.println("4. BBN ");
                System.out.println("5. Mutasi");
                System.out.print("Pilihan = ");
                pil=in.nextInt();
                if(pil==1){
                    by.herStnk(Ktp);
                    her=by.getHerStnk();
                    System.out.println("Biaya Her = "+by.getHerStnk());
                }
                else if(pil==2){
                    sby.gantiPlat(Ktp);
                    gntp=sby.getGntPlat();
                    System.out.println("Biaya Ganti plat = "+sby.getGntPlat());
                }
                else if(pil==3){

                    sby.Duplikat(Ktp);
                    dplk=sby.getDuplikat();
                    System.out.println("Biaya Duplikat STNK = "+sby.getDuplikat());
                }
                else if(pil==4){
                    System.out.print("BBN 1 wilayah / 2 wilayah? = ");
                    pil=in.nextInt();
                    if(pil==1){
                    sby.bbn1Wil(Ktp);
                    bbn=sby.getBbn1Wl();
                        System.out.println("Biaya BBN = "+sby.getBbn1Wl());
                    }
                    else{
                    sby.bbn2Wil(Ktp);
                    bbn=sby.getBbn2Wl();
                        System.out.println("Biaya BBN = "+sby.getBbn2Wl());
                    }
                }
                else if(pil==5){
                    System.out.print("Mutasi Dari = ");
                    asal=in.next();
                    System.out.print("Tujuan = ");
                    tujuan=in.next();
                    if((asal=="gresik"||asal=="sidoarjo")&&tujuan == "surabaya"){
                        sda.mutasi();
                        mts=by.getMutasi();
                        System.out.println("Biaya Mutasi = "+by.getMutasi());
                    }
                    else if((asal=="sidoarjo"||asal=="surabaya")&&tujuan=="gresik"){
                        grs.mutasi();
                        mts=by.getMutasi();
                        System.out.println("Biaya Mutasi = "+grs.getMutasi());
                    }
                    else{
                        
                    }
                
                }
                System.out.println("============= Input Konsumen ===========");
                System.out.print("index = ");
                pil=in.nextInt();
                System.out.print("Nama : ");
                nama=in.next();
                System.out.print("No Kontrak : ");
                noKontrak=in.next();
                System.out.print("Kendaraan (motor/mobil) : ");
                kendaraan=in.next();
                System.out.print("type/merk : ");
                type=in.next();
                System.out.print("Tahun : ");
                tahun=in.nextInt();
                komp.update(pil,nama,noKontrak,kendaraan,type,tahun,pajak,her,gntp,dplk,bbn,mts);
                break;
                
        }
        
        System.out.println("Apakah anda ingin keluar program? (Y/N)");
        ljt=in.next().charAt(0);
    }
    while(ljt == 'n'||ljt== 'N');
    }
}
