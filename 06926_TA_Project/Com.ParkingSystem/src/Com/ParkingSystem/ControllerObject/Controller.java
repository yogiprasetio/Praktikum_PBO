/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.ParkingSystem.ControllerObject;

import Com.ParkingSystem.Object.Admin;

import Com.ParkingSystem.Object.Motor;
import Com.ParkingSystem.Object.User;
import java.util.ArrayList;

/**
 *
 * @author yogi-06926
 */
public class Controller {
    public static ArrayList<Motor> lis = new ArrayList<Motor>();
    public static ArrayList<Admin> admin = new ArrayList<Admin>();
    public static ArrayList<User> userR = new ArrayList<User>();
    
    public void TambahUser(String nama,String password,String id){
        User user = new User(nama, password, id);
        userR.add(user);
    }
    
    public void TambahAdmin(String nama,String password,String id){
        Admin ad= new Admin(nama, password, id);
        admin.add(ad);
    }
    
    public void TambahController(String plat,String typee,String tanggal,int biaya,int waktuMasuk,int waktuKeluar){
        
            Motor motor = new Motor(plat,typee,tanggal,biaya,waktuMasuk,waktuKeluar);
            lis.add(motor);
        
        
    }
    public void DeleteData(int del){
        
    }
    
    public ArrayList<Motor>getALLL(){
        return lis;
    }
    
    public ArrayList<User>getUserAll(){
        return userR;
    }
    
}
