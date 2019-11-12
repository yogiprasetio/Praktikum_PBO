package pkg06926mainMain;

public class Pegawai extends Manusia {
    
    private int id;
    private String kataSandi;
    
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    
    public void setKataSandi(String kataSandi)
    {
        this.kataSandi=kataSandi;
    }
    public String getKataSandi()
    {
        return kataSandi;
    }
    @Override
    public void print()
    {
        System.out.println(" Id Pegawai : "+this.getId());
        System.out.println(" Nama       : "+this.getNama());
        System.out.println(" No Hp      : "+this.getNoHp());
    }
    
}
