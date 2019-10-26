package npm06926praktikumm3;

/**
 *
 * @author yogi-06926
 */
public class Data {

    private String name, nik;
    private int antri;

    
    Data(String a, String b, int c) {
        this.name = a;
        this.nik = b;
        this.antri = c;
    }

    public String getName() {
        return name;
    }

    public String getNik() {
        return nik;
    }

    public int getAntri() {
        return antri;
    }
}
