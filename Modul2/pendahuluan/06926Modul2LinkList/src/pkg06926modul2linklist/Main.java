package pkg06926modul2linklist;

class pegawai{
    private static class node{
        int nip;
        String nama, jabatan;
        node next;
        node prev;
        node(int a,String b, String c){
            this.nip = a;
            this.nama=b;
            this.jabatan=c;
            this.next=null;
            this.prev=null;
        }
    }
    node head;
    node tail;
    
    void tambah (pegawai list,int a,String nama, String jabatan){
        node data_pegawai=new node(a,nama,jabatan);
        if(list.head==null){
            list.head=data_pegawai;
            list.tail=data_pegawai;
        }
        else{
            data_pegawai.next=list.tail;
            data_pegawai.prev=null;
            list.tail.prev=data_pegawai;
            list.tail=data_pegawai;
        }
    }
    
    void lihat(pegawai list){
        node view=list.tail;
        System.out.println("==Data Pegawai==");
        //pencarian data
        while(view!=null){
            System.out.println(view.nama+"->"+view.jabatan);
            view=view.next;
        }
        System.out.println("================");
    }
}
public class Main {

    public static void main(String[] args) {
        pegawai karyawan=new pegawai();
        karyawan.tambah(karyawan,1,"andi","programer");
        karyawan.tambah(karyawan,2,"budi","designer");
        karyawan.tambah(karyawan,3,"cici","PM");
        karyawan.tambah(karyawan,4,"didi","programer");
        karyawan.lihat(karyawan);
    }
    
}
