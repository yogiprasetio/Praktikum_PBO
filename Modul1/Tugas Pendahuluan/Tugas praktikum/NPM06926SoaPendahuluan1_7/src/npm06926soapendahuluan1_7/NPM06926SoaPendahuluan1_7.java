package npm06926soapendahuluan1_7;


class Lingkaran {
    double Diameter;
    double Phi = 3.14;
    public Lingkaran(double Diameter){
        this.Diameter = Diameter;
    }
    void keliling(){
        double kll = Diameter*Phi;
        System.out.println("Keliling Lingkaran adalah = "+kll);
    }
    double Luas(){
    double Luas = Diameter/2*Phi*Phi;
    return Luas;
    }
}
public class NPM06926SoaPendahuluan1_7 {

    public static void main(String[] args) {
   double Diameter = 10;
   //pembuatan Objek LIngkaran
   Lingkaran Bullet = new Lingkaran(Diameter);
   Bullet.keliling();
   double Luas = Bullet.Luas();
   System.out.println("Luas Lingkaran Adalah = "+Luas);
    }
    
}
