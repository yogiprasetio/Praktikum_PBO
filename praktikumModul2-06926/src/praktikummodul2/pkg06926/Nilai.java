package praktikummodul2.pkg06926;

/**
 *
 * @author yogi-06926
 */
public class Nilai {
    private static class pointer{
        String NamaS;
        int NipA;
        int Nikmat;
        int i;
        pointer next;
        pointer prev;
        pointer(String a, int b, int c,int D){
            this.i=D;
            this.NamaS=a;
            this.NipA=b;
            this.Nikmat=c;
            this.next=null;
            this.prev=null;
        }
    }
    pointer head;
    pointer tail;
    
    void Tambah(Nilai list,String a,int b,int c,int D){
        pointer data_nilai=new pointer(a,b,c,D);
        if(list.head==null){
            list.head=data_nilai;
            list.tail=data_nilai;
        }
        else{
            data_nilai.next=list.tail;
            data_nilai.prev=null;
            list.tail.prev=data_nilai;
            list.tail=data_nilai;
        }
    }
    
    void cetak(Nilai list){
        pointer view=list.tail;
        System.out.println("=========Daftar Nilai=========");
        while(view !=null){
            System.out.println("Nama                : "+view.NamaS);
            System.out.println("Nilai IPA           : "+view.NipA);
            System.out.println("Nilai Matemathics   : "+view.Nikmat);
            view=view.next;
        }
        System.out.println("==============================");
    }
}
