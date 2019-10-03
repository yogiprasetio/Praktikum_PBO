package npm06926soalpendhuluan1_3;
import java.util.Scanner;
public class NPM06926soalPendhuluan1_3 {

    public static void main(String[] args) {
       Scanner Input = new Scanner(System.in);
       System.out.print("Masukkan Diameter alas Tabung = ");
       double Diameter = Input.nextDouble();
       System.out.print("\nMasukkan tinggi Tabung = ");
       double Tinggi = Input.nextDouble();
       double Phi = 3.14;
       double Volume = (Diameter/2*Phi*Phi)*Tinggi;
       System.out.println("\nVolume tabung adalah = "+Volume);
    }
    
}
