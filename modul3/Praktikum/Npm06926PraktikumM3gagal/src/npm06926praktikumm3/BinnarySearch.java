package npm06926praktikumm3;
import java.util.*;

class BinnarySearch {
    
    int m, l,f;
    String  g;
    
    
    public void sBinnary(String it) {
//        Collections.sort(baru);
//        int iStringSearch = Collections.binarySearch(baru, it);
//    
      
        boolean temu;
        f = 0;
        l = baru.size();
        System.out.println(l);
        m = (f + l) / 2;
        if(baru.get(m).getName().equals(it)){
            temu= true;
            System.out.println("If 1");
        }
        else{temu = false;}
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
