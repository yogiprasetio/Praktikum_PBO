package main.PaperProblem;
import java.util.ArrayList;
/**
 *
 * @author yogi-06926
 */
public class Controller {
    ArrayList<Departement> list;
    ArrayList<kertas> listkertas=new ArrayList<>();

    Controller() {
        list = new ArrayList<>();
    }
    
    public void tambahList(String nama,String jabatan,String Departemens,String tujuan,String ukuran,int saldo,int debet,String waktu){
        Departement dept=new Departement(nama,jabatan,Departemens,tujuan,ukuran,saldo,debet,waktu);
        
        list.add(dept);
    } 
    
    public void tambahList(String nama,int saldo,int debet,String waktu){
        kertas kertas=new kertas(saldo, debet, nama, waktu);
        
        listkertas.add(kertas);
    }
    
    
    
    public ArrayList<kertas>tampil(){
        return listkertas;
    }
    
    public ArrayList<Departement>getALL(){
        return list;
    }
    
}
