package npm06926soalpendahuluan1_8;
class Lingkaran{
    double Diameter;
    double Phi = 3.14;
    void SetDiameter(double Dm){
        this.Diameter=Dm;
    }
    void Keliling(){
        double kll= Diameter*Phi*Phi;
        System.out.println("Keliling Lingkaran Adalah = "+kll);
    }
    double Luas(){
        double Luas = Diameter/2*Phi*Phi;
        return Luas;
    }
}

public class NPM06926SoalPendahuluan1_8 {

    public static void main(String[] args) {
        //Pembuatan Objek Lingkaran
        Lingkaran Bullet = new Lingkaran();
        double Diameter = 10;
        Bullet.SetDiameter(Diameter);
        Bullet.Keliling();
        double Luas = Bullet.Luas();
        System.out.println("Luas Lingkaran adalah = "+Luas);
    }
    
}
