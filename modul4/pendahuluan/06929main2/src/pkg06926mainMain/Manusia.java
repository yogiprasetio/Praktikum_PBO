package pkg06926mainMain;

public class Manusia {
    
    private String nama;
    private String noHp;
    
    public void setNama(String nama)
    {
        this.nama=nama;
    }
    protected String getNama()
    {
        return nama;
    }
    public void setNoHp(String noHp)
    {
        this.noHp=noHp;
    }
    protected String getNoHp()
    {
        return noHp;
    }
    public void print()
    {
        System.out.println(" Nama  : "+this.getNama());
        System.out.println(" No HP : "+this.getNoHp());
    }
    
}
