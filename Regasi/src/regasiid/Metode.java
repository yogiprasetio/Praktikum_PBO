package regasiid;

/**
 *
 * @author yogi-06926
 */
public class Metode {
    
    int[] x=new int[10];
   int[] y=new int[10];
   double x1;
   
    int Ey = 0;
    int E2x = 0;
    int Ex = 0;
    int Exy = 0;
    int Ex2;
    int n = 6;
    double xdata, ydata;
    double c1, c2, c3, m1, m2, m3 ;
    void inputperdiksi(double h){
        xdata=h;
//        soal.setX1(h);
    }
    
  void entri(int a,int i,int b,int j){
      x[i]=a;
      y[j]=b;
//      System.out.println("a = "+a);
//      System.out.println("b = "+b);
//      System.out.println("i = "+i);
//      System.out.println("j = "+j);
//      System.out.println("class metode ^^");
//      soal= new Soal(a,i,b,j);
      
  }

  void penyeleseian(int pil){
//      int[] f=soal.getX();
//      int[] v=soal.getY();
      for (int i=0; i<pil; i++)
        {
            Ey+= y[i];
            E2x+=(x[i]*x[i]);
            Ex+=x[i];
            Exy+=(x[i]*y[i]);
        }
        Ex2 = Ex*Ex;
        c1 = ((Ey*E2x)-(Ex*Exy));
        c2 = ((n*E2x)-Ex2);
        c3 = c1/c2;
        m1 = (n*Exy)-(Ex*Ey);
        m2 = (n*E2x)-Ex2;
        m3 = m1/m2;
        ydata = (m3*xdata)+c3;
  }
  public void cetaksoal(int pil){ 
      System.out.print("iki x = ");
    for(int q=0;q<pil;q++){
      System.out.print("| "+x[q]);
      
    }
      System.out.print("\n------------------\niki y = ");
    for(int q=0;q<pil;q++){
      System.out.print("| "+y[q]);
      
    }
  }
  void hasil(){
        System.out.println(Ey);
        System.out.println(E2x);
        System.out.println(Ex);
        System.out.println(Exy);
        System.out.println(Ex2);
        System.out.println(n);
        System.out.println(c3);
        System.out.println(m3);
        System.out.println(ydata);
  }
}
