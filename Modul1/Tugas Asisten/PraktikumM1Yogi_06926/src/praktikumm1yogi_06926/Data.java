package praktikumm1yogi_06926;


/**
 *
 * @author yogi-06926
 */
public class Data {

    int[] c = new int[5];
    int j, k, a, l,s;
    
    Data(){
        this.s=0;
    }

   void Masuk(int j) {
            
            c[s] = j;
               this.s=this.s+1;
    }

    void Ascending() {

        for (s = 0; s < c.length; s++) {
            for (l = 0; l < (c.length - 1); l++) {
                if (c[l] > c[l + 1]) {
                    k = c[l];
                    c[l] = c[l + 1];
                    c[l + 1] = k;
                }
            }
        }
        
    }

    void Descending() {

        for (s = 0; s < c.length; s++) {
            for (l = 0; l < (c.length - 1); l++) {
                if (c[l] < c[l + 1]) {
                    k = c[l];
                    c[l] = c[l + 1];
                    c[l + 1] = k;
                }
            }
        }
     
    }

    int[] Cetak() {
        return c;
    }

}
