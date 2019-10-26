package npm06926praktikummodul3;
import java.util.ArrayList;

public class controlnya {
    ArrayList<Orang> orang;
    int i;
    SequentialSort Ssearch=new SequentialSort();
    BinnarySearch Sbin=new BinnarySearch();
    
    controlnya(){
    orang=new ArrayList<>();
    
    }
    
    public void entri(String a,String b,int c){
        Orang data=new Orang(a,b,c);
        orang.add(data);
    }
    
    public ArrayList<Orang>getList(){
        return orang;
    }
    
    public void SequentialSearch(String it){
        Ssearch.Ssort(it, orang);
    }
    
    public void binnaryS(String it){
        Sbin.Sbin(it, orang);
    }
}
