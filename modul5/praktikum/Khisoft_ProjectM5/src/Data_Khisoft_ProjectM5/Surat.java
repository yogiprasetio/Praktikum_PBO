package Data_Khisoft_ProjectM5;

/**
 *
 * @author yogi-06926
 */
public class Surat {
    private int noSurat;
    private int jmlLamp;
    private String judulSurat;
    private String engirim;
    private String penerima;
    private String prihal;
    private String keterangan;

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    

    public String getEngirim() {
        return engirim;
    }

    public int getJmlLamp() {
        return jmlLamp;
    }

    public int getNoSurat() {
        return noSurat;
    }

    public String getJudulSurat() {
        return judulSurat;
    }

    public String getPrihal() {
        return prihal;
    }

    public String getPenerima() {
        return penerima;
    }

    public void setEngirim(String engirim) {
        this.engirim = engirim;
    }

    public void setJmlLamp(int jmlLamp) {
        this.jmlLamp = jmlLamp;
    }

    public void setJudulSurat(String judulSurat) {
        this.judulSurat = judulSurat;
    }

    public void setNoSurat(int noSurat) {
        this.noSurat = noSurat;
    }

    public void setPenerima(String penerima) {
        this.penerima = penerima;
    }

    public void setPrihal(String prihal) {
        this.prihal = prihal;
    }
     
}
