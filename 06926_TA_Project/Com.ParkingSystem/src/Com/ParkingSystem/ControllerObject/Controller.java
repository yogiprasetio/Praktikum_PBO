/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.ParkingSystem.ControllerObject;

import Com.ParkingSystem.Object.Mobil;
import Com.ParkingSystem.Object.Motor;
import Com.ParkingSystem.Object.User;
import java.util.ArrayList;

/**
 *
 * @author yogi-06926
 */
public class Controller {
    public static ArrayList<Motor> lis = new ArrayList<Motor>();
    public static ArrayList<Mobil> lis2 = new ArrayList<Mobil>();
    public static ArrayList<User> userR = new ArrayList<User>();
    
    public void TambahUser(String nama,String password,String id){
        User user = new User(nama, password, id);
        userR.add(user);
    }
    
    public void TambahController(String plat,String typee,String tanggal,int biaya,int waktuMasuk,int waktuKeluar){
        if(typee.equals("Motor")){
            Motor motor = new Motor(plat,typee,tanggal,biaya,waktuMasuk,waktuKeluar);
            lis.add(motor);
        }
        else{
            Mobil mobil = new Mobil(plat,typee,tanggal,biaya,waktuMasuk,waktuKeluar);
            lis2.add(mobil);
        }
    }
    
    public ArrayList<Mobil>getALL(){
        return lis2;
    }
    
    public ArrayList<Motor>getALLL(){
        return lis;
    }
    
    public ArrayList<User>getUserAll(){
        return userR;
    }
    
}
