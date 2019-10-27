package regasiid;
import java.util.Scanner;
/**
 *
 * @author yogi-06926
 */
public class RegasiID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Metode selesei=new Metode();
//        Soal cek=new Soal(int a,int i,int b,int j);
        int pil=0,a,b,i=0,j=0;
        
        
        System.out.println("=============== REGASI ==================");
        System.out.println("Inputkan Soal : \nPPerhatikan inputan anda, Jangan Sampai\ninputan anda sekarang lebih kecil\ndari inputan sebelumnnya...");
        System.out.print("Masukkan Batas Data : ");
        pil=scan.nextInt();
        for(int k=0;k<pil;k++){
            
            System.out.print("X -> "+k+" = ");
            a=scan.nextInt();
            System.out.print("Y -> "+k+" = ");
            b=scan.nextInt();
            j=k;
            
            i=k;
            
            System.out.println("k = "+j);
            System.out.println("i = "+i);
            System.out.println("class main ^^");
            selesei.entri(a, i, b, j);
            
//            int[] p = anyar.getX(); System.out.print(p[i]+" , ");
//            int[] q = anyar.getY(); System.out.print(q[i]+" , ");
        }
        selesei.cetaksoal(pil);
        
        System.out.println("\nMasukkan data yg ingin di prediksi : ");
        double h=scan.nextDouble();
        selesei.inputperdiksi(h);
        System.out.println("==================================================");
        selesei.penyeleseian(pil);
        
        System.out.println("hasilnanya adalah : ");
        selesei.hasil();
        
    }
    
}
