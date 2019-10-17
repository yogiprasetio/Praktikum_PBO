package bantutemanlinklist;

/**
 *
 * @author yogi-06926
 */
//public class petunjukArah {
//    public static class node{
//        
//        node next;
//        node prev;
//        node(){
//            
//            this.next=null;
//            this.prev=null;
//        }
//    }
//    node head;
//    node tail;
//}
public class Node{

    Node next;
    Node prev;
    ikiDataLoh data;
    public Node(ikiDataLoh dataLoh) {
       this.data = new ikiDataLoh(dataLoh.nip,dataLoh.nama,dataLoh.jabatan);
        this.next=null;
        this.prev=null;
    }
    
}
