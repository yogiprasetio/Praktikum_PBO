package ControllerLogic;

import Object.Karyawan;
import java.util.ArrayList;


public class Controller {
    public static ArrayList<Karyawan> kar = new ArrayList<Karyawan>();
    Karyawan krywn;
    
    public Controller(String nama,String jabatan,float bpjs,int kehadiran){
        krywn=new Karyawan(nama, jabatan, bpjs, kehadiran);
        kar.add(krywn);
    }
    
    public void DeleteData(int index){
        kar.remove(index);
    }
}
