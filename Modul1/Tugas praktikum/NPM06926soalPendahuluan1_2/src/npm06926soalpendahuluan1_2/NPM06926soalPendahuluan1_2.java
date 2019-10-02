package npm06926soalpendahuluan1_2;
import java.util.Scanner;
public class NPM06926soalPendahuluan1_2 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan Diameter Lingkaran = ");
        int Diameter = Input.nextInt();
        double Phi = 3.14;
        double Luas = Diameter/2*Phi*Phi;
        System.out.println("Luas lingkaran adalah = "+Luas);
    }
    
}
