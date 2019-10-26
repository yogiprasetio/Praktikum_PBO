package npm06926praktikumm3;
import java.util.*;

class BinnarySearch extends ikiController {
    
    int m, l;
    String  f;
    
    
    public void sBinnary(String it) {
        Collections.sort(baru);
        int iStringSearch = Collections.binarySearch(baru, it);
    }
      
    
//        f = 0;
//        l = baru.size();
//        m = (f + l) / 2;
//        while (f <= l) {
//            if (baru.get(m).getName() != it) {
//                f = m + 1;
//            } else if (baru.get(m).getName().equals(it)) {
//                System.out.println(it + " found at location " + (m + 1) + ".");
//                break;
//            } else {
//                l = m - 1;
//            }
//            m = (f + l) / 2;
//        }
//        if (f > l) {
//            System.out.println(it + " is not found.\n");
//        }
//    }
}
