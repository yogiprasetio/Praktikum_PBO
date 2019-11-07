package tugasaslabm3;

/**
 *
 * @author yogi-06926
 */
public class konsumen {
private String nama, noKontrak;
public unit unt;
int her;int total;int gntp;int dplk;int bbn;int mts;int pajak;
//nama,noKontrak,kendaraan,type,tahun,pajak,her,gntp,dplk,bbn,mts
konsumen(String nama, String noKontrak,String kendaraan,String type,int tahun,int pajak,int her,int gntp,int dplk,int bbn,int mts){
    this.nama=nama;
    this.noKontrak=noKontrak;
    this.unt=new unit(kendaraan,type,tahun);
    this.bbn=bbn;
    this.dplk=dplk;
    this.gntp=gntp;
    this.her=her;
    this.mts=mts;
    this.pajak=pajak;
    this.total=bbn+dplk+gntp+her+mts;
}

public String getNama(){
    return nama;
}

public String getNoKontrak(){
    return noKontrak;
}

}
