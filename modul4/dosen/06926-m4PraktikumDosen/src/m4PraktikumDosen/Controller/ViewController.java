package m4PraktikumDosen.Controller;

import m4PraktikumDosen.View.LihatData;
import m4PraktikumDosen.View.main_view;
/**
 *
 * @author yogi-06926
 */
public class ViewController implements NewInterfaceTugasDosen {

    @Override
    public void goToMainView() {
       main_view main_view = new main_view(); 
    }

    @Override
    public void goToLihatData() {
        LihatData lihat = new LihatData();
    }
    
}
