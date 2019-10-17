package bantutemanlinklist;
//import java.util.Scanner;
public class BantuTemanLinkList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner ayo=new Scanner(System.in);
        isineData isien=new isineData();
        isien.tambah(isien,1,"andi","programer");
        isien.tambah(isien,2,"budi","designer");
        isien.tambah(isien,3,"cici","PM");
        isien.tambah(isien,4,"didi","programer");
        isien.lihat(isien);
    }
    
}
