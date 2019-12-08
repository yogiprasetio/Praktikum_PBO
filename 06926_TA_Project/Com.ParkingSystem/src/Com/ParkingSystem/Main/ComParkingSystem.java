/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.ParkingSystem.Main;

import Com.ParkingSystem.View.*;
import Com.ParkingSystem.ViewController.ControllerVIew;

/**
 *
 * @author yogi-06926
 */
public class ComParkingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        MainView main = new MainView();
//        login log = new login();
            ControllerVIew viww = new ControllerVIew();
            viww.goToLoginVIew();
    }
    
}
