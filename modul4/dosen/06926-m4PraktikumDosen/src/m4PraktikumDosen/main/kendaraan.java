package m4PraktikumDosen.main;

/**
 *
 * @author yogi-06926
 */
public class kendaraan {
    private String plat;
    private String tanggal;
    private int waktuMasuk;
    private int waktuKeluar;
    private int by;
    
    public kendaraan(String plat,String tanggal,int waktuMasuk,int waktuKeluar,int harga){
        this.plat=plat;
        this.tanggal=tanggal;
        this.waktuKeluar=waktuKeluar;
        this.waktuMasuk=waktuMasuk;
        this.by=harga;
        System.out.println("Aku Nang kendaraan");    
            System.out.println(by);
                System.out.println("-----------");
    }

//    public void setWaktuKeluar(int waktuKeluar) {
//        this.waktuKeluar = waktuKeluar;
//    }

    public int getBy() {
        return by;
    }
    

    public  String getPlat() {
        return plat;
    }

    public  String getTanggal() {
        return tanggal;
    }

    public int getWaktuMasuk() {
        return waktuMasuk;
    }

    public int getWaktuKeluar() {
        return waktuKeluar;
    }
    
    
}
