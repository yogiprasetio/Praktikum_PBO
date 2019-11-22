package pkg06926.m4praktikum;

/**
 *
 * @author yogi-06926
 */
public class kendaraan {
    String plat;
    String tanggal;
    int waktuMasuk;
    int waktuKeluar;
    int by;
    
    kendaraan(String plat,String tanggal,int waktuMasuk,int waktuKeluar,int by){
        this.plat=plat;
        this.tanggal=tanggal;
        this.waktuKeluar=waktuKeluar;
        this.waktuMasuk=waktuMasuk;
        this.by=by;
    }

//    public void setWaktuKeluar(int waktuKeluar) {
//        this.waktuKeluar = waktuKeluar;
//    }

    public int getBy() {
        return by;
    }
    

    public String getPlat() {
        return plat;
    }

    public String getTanggal() {
        return tanggal;
    }

    public int getWaktuMasuk() {
        return waktuMasuk;
    }

    public int getWaktuKeluar() {
        return waktuKeluar;
    }
    
    
}
