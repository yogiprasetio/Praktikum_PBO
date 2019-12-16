package Object;


public class Karyawan {
private String nama,jabatan;
private float bpjs;
private int kehadiran;
public Karyawan(String nama,String jabatan,float bpjs,int kehadiraan){
    setNama(nama);
    setBpjs(bpjs);
    setKehadiran(kehadiran);
    setJabatan(jabatan);
}

    public float getBpjs() {
        return bpjs;
    }

    public String getJabatan() {
        return jabatan;
    }

    public int getKehadiran() {
        return kehadiran;
    }

    public String getNama() {
        return nama;
    }

    public void setBpjs(float bpjs) {
        this.bpjs = bpjs;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
 
}
