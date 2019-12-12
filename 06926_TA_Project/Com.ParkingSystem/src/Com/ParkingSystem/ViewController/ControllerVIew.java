package Com.ParkingSystem.ViewController;

import Com.ParkingSystem.View.AdminView;
import Com.ParkingSystem.View.MainView;
import Com.ParkingSystem.View.ViewData;
import Com.ParkingSystem.View.WRONG;
import Com.ParkingSystem.View.addUsr;
import Com.ParkingSystem.View.listUser;
import Com.ParkingSystem.View.login;

/**
 *
 * @author yogi-06926
 */
public class ControllerVIew implements View {
    
    public void Wrong(){
        WRONG salah = new WRONG();
        
    }
   
    public void listUser(){
        listUser list = new listUser();
    }
    
    public void admin(){
        AdminView admine = new AdminView();
    }
    
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
    public void ViewData() {
        ViewData data = new ViewData();
        
    }
    
}
