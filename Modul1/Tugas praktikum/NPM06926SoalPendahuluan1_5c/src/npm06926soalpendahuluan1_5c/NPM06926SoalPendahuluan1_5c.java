package npm06926soalpendahuluan1_5c;

public class NPM06926SoalPendahuluan1_5c {

    public static void main(String[] args) {
       int a;
       do{
           for(a=10;a>0;a--){
               if((a%2)==1){
                   System.out.print(",");
               }
               else{
                   System.out.print(a);
               }
           }
           System.out.println(".");
       }
       while(a!=0);
    }
    
}
