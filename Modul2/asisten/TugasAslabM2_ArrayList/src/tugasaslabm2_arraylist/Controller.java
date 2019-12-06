package tugasaslabm2_arraylist;
import java.util.ArrayList;
/**
 *
 * @author yogi-06926
 */
public class Controller {
    ArrayList<Data> arraylistdata;
    private int i;
    
    
    Controller(){
        arraylistdata=new ArrayList<Data>();
    }
    void insert(String name,int a,int b){
        Data nilai=new Data(name,a,b);
        arraylistdata.add(nilai);
    }
    
    void update(int c,String name,int a,int b){
        
        arraylistdata.set(c,new Data(name,a,b));
    }
    
    void delete(int d){
        arraylistdata.remove(d);
    }
    
    public ArrayList<Data>getALL(){
        return arraylistdata;
    }
}
