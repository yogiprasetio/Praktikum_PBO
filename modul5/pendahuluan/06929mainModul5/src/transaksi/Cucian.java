package transaksi;
import pengguna.*;
public class Cucian {
    
    private Pegawai pegawai;
    private Pelanggan pelanggan;
    private float berat,hargaTotal,perKilo = 5000;
    
    public void setPegawai(Pegawai pegawai)
    {
        this.pegawai=pegawai;
    }
    private Pegawai getPegawai()
    {
        return pegawai;
    }
    
    public void setPelanggan(Pelanggan pelanggan)
    {
        this.pelanggan=pelanggan;
    }
    private Pelanggan getPelanggan()
    {
        return pelanggan;
    }
    private float getBerat()
    {
        return berat;
    }
    private float getPerKilo()
    {
        return this.perKilo;
    }
    
    public float getHargaTotal(float berat)
    {
        this.berat=berat;
        return this.berat;
    }
    private float getHargaTotal(float berat, float perKilo)
    {
        return this.hargaTotal=berat*perKilo;
    }
    
    public void print()
    {
        System.out.println(" Nama Pegawai       : "+this.getPegawai().getNama());
        System.out.println(" Nama Pelanggan     : "+this.getPelanggan().getNama());
        System.out.println(" Berat cucian       : "+this.getBerat()+" KG.");
        System.out.println(" Harga total cucian : Rp."+this.getHargaTotal(this.getHargaTotal(berat),this.getPerKilo()));
    }
}
