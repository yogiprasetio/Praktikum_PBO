package Com.ParkingSystem.ViewController;

import Com.ParkingSystem.View.MainView;
import Com.ParkingSystem.View.ViewData;
import Com.ParkingSystem.View.addUsr;
import Com.ParkingSystem.View.login;

/**
 *
 * @author yogi-06926
 */
public class ControllerVIew implements View {

    @Override
    public void goToLoginVIew() {
        login log = new login();
    }

    @Override
    public void goToAddUser() {
        addUsr adus = new addUsr();
    }

    @Override
    public void goToMainView() {
        MainView main = new MainView();
    }

    @Override
    public void goToViewData() {
        ViewData data = new ViewData();
    }
    
}
