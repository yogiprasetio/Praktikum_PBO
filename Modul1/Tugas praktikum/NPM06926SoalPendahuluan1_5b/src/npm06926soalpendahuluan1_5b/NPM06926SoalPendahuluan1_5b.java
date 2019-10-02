package npm06926soalpendahuluan1_5b;

public class NPM06926SoalPendahuluan1_5b {

    public static void main(String[] args) {
        int a= 10;
        while(a != 0)
        {
            if ((a%2)==1){
                System.out.print(",");
            }
            else{
                System.out.print(a);
            }
            a--;
        }
        System.out.println(".");
    }
    
}
