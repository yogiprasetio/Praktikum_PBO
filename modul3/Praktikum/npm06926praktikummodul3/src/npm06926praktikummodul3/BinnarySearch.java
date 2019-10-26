package npm06926praktikummodul3;
import java.util.ArrayList;
/**
 *
 * @author yogi-06926
 */
public class BinnarySearch extends SequentialSort{
    
    public void Sbin(String it,ArrayList<Orang>orang) {
//        Collections.sort(baru);
//        int iStringSearch = Collections.binarySearch(baru, it);
//    
      
//        boolean temu;
        f = 0;
        l = orang.size();
//        System.out.println(l);
        m = (f + l) / 2;
//        if(orang.get(m).getNama().equals(it)){
//            temu= true;
//            System.out.println("If 1");
//        }
//        else{temu = false;}
        while (f <= l) {
            
            if (temu = false) {
                f = m + 1;
            } else if (temu = true) {
                System.out.println(it + " found at location " + (m + 1) + ".");
                break;
            } else {
                l = m - 1;
            }
            m = (f + l) / 2;
        }
        if (f > l) {
            System.out.println(it + " is not found.\n");
        }
   }
}
