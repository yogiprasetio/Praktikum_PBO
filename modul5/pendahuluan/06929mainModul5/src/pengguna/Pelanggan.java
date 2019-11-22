package pengguna;

public class Pelanggan extends Manusia {

    private String nama, noHp;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public void print() {
        System.out.println(" Id Pelanggan : " + this.getId());
        System.out.println(" Nama         : " + this.getNama());
        System.out.println(" No Hp        : " + this.getNoHp());
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    @Override
    public String getNoHp() {
        return noHp;
    }
}
