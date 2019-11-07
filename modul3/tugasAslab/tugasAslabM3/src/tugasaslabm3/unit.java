package tugasaslabm3;

/**
 *
 * @author yogi-06926
 */
public class unit {
private String kendaraan, type;
private int tahun;

unit(String kendaraan,String type,int tahun){
    this.kendaraan=kendaraan;
    this.type=type;
    this.tahun=tahun;
}

public String getKendaraan(){
    return kendaraan;
}

public String getType(){
    return type;
}

public int getTahun(){
    return tahun;
}

}
