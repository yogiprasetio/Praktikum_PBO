package npm06926soalpendhuluan1_4;
import java.util.Scanner;
public class NPM06926soalPendhuluan1_4 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
 
            char Ljt;
        do {
            System.out.print("Masukkan Umur anda = ");
            int Umur = Input.nextInt();
            if (Umur>50){
                System.out.println("Kategori = TUA");
            }
            else if (Umur<=50 && Umur>=18){
               System.out.println("Kategori = DEWASA");
            }
            else if (Umur>=6 && Umur<=17){
                System.out.println("Kategori = ANAK-ANAK");
            }
            else {
                System.out.println("Kategori = BALITA");
            }
            
            System.out.print("Apakah anda inngin keluar program (y/n)? = ");

                    Ljt= Input.next().charAt(0);
        } 
        while (Ljt == 'n'|| Ljt == 'N');
        
    }
    
}
