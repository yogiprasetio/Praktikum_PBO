package pkg06926mainMain;

public class Pelanggan extends Manusia {
    
    private int id;
    
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    @Override
    public void print()
    {
        System.out.println(" Id Pelanggan : "+this.getId());
        System.out.println(" Nama         : "+this.getNama());
        System.out.println(" No Hp        : "+this.getNoHp());
    }
}
