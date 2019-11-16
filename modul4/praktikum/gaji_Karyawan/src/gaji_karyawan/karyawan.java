package gaji_karyawan;

/**
 *
 * @author yogi-06926
 */
public class karyawan {
    private String nama;
    private String jabatan;
    private int gaji;
    private String status;
    private int anak;


    public karyawan(String nama,String jabatan,int gaji,String status,int anak){
        this.nama=nama;
        this.gaji=gaji;
        this.jabatan=jabatan;
        this.anak=anak;
        this.status = status;
    }
    
//    public void setNama(String nama) {
//        this.nama = nama;
//    }
//
//    public void setGaji(String gaji) {
//        this.gaji = gaji;
//    }
//
//    public void setJabatan(String jabatan) {
//        this.jabatan = jabatan;
//    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public int getGaji() {
        return gaji;
    }

    public int getAnak() {
        return anak;
    }

    public String getStatus() {
        return status;
    }
    
    
    
}
