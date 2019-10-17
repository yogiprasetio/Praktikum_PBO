package bantutemanlinklist;

/**
 *
 * @author yogi-06926
 */
public class isineData{
        Node head;
        Node tail;
    void tambah (isineData list,int a,String nama, String jabatan){
        Node pegawai= new Node(new ikiDataLoh(a, nama, jabatan));
        if(list.head==null){
            list.head=pegawai;
            list.tail=pegawai;
        }
        else{
            pegawai.next=list.tail;
            pegawai.prev=null;
            list.tail.prev=pegawai;
            list.tail=pegawai;
        }
    }
    
    void lihat(isineData list){
        Node view=list.tail;
        System.out.println("==Data Pegawai==");
        //pencarian data
        while(view!=null){
            System.out.println(view.data.nama+"->"+view.data.jabatan);
            view=view.next;
        }
        System.out.println("================");
    }
}
