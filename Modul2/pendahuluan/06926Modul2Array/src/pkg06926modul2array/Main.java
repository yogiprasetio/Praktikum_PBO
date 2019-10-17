package pkg06926modul2array;
class Pegawai{
    
         int NIP;
         String Nama;
         String Jabatan;
         void Tambah(int b,String c, String d){
             this.NIP=b;
             this.Nama=c;
             this.Jabatan=d;
         }
    
         void Tampil(){
             
            
                 System.out.println(". "+Nama+"\t->"+Jabatan);
             
             
         }
}
public class Main {
   
    public static void main(String[] args) {
        Pegawai baru[]=new Pegawai[5];
        baru[0].Tambah(0101, "Budi", "Programmer");
        baru[1].Tambah(0202, "Suminem", "Office Boy");
        baru[2].Tambah(0303, "Herry", "Manager");
        baru[3].Tambah(0404, "Musrijem", "Derektur utama");
        System.out.println("======List Karyawan======");
        for(int i=0;i<4;i++){
       
        baru[i].Tampil();
        
        }
        System.out.println("=========================");
    }
}
