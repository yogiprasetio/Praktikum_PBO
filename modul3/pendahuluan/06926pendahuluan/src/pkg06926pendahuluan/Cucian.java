package pkg06926pendahuluan;
public class Cucian {
   Pegawai pegawai;
   float berat;
   Pelanggan pelanggan;
   float hargaTotal;
   
   void setPegawai(Pegawai pegawai){
       this.pegawai=pegawai;
   }
   
   Pegawai getPegawai(){
       return pegawai;
   }
   
   void setPelanggan(Pelanggan pelanggan){
       this.pelanggan=pelanggan;
   }
   
   Pelanggan getPelanggan(){
       return pelanggan;
   }
   
   void setBerat(float berat){
       float perKilo=5000;
       this.berat=berat;
       this.hargaTotal=this.getBerat()*perKilo;
   }
   
   float getBerat(){
       return berat;
   }
   
   float getHargaTotal(){
       return hargaTotal;
   }
   
}
