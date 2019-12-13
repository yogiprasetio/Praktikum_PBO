/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.ParkingSystem.View;

import Com.ParkingSystem.ControllerObject.Controller;
import Com.ParkingSystem.ViewController.ControllerVIew;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;



/**
 *
 * @author yogi-06926
 */
public class AdminView extends Componnent{
    Date cal;
    String rpDate,typee;
    String tanggal,bulan,tahun;
    DateFormat df;
    public AdminView() {
        int tIncome =0;
        logo.setSize(70,70);
        tampil();
        logo.setBounds(10, 5, 200, 100);
        add(logo);
        
        judul2.setBounds(200, 20, 900, 60);
        judul1.setFont(new Font("Arial",1,24));
        judul1.setBounds(150, 20, 500, 20);
        judul2.setFont(new Font("Arial",1,24));
        add(judul1);
        add(judul2);
        
        lblIn.setText("Hari         :");
        lblIn.setBounds(10,88,70,30);
        lblIn.setFont(new Font("Arial",Font.BOLD,14));
        //add(lblIn);
        
        df = new SimpleDateFormat("MM/DD/YYY HH:mm:ss");
                cal = Calendar.getInstance().getTime();
                rpDate = df.format(cal);
                tanggal = rpDate;
        judulHasilTanggal.setText(tanggal);
        judulHasilTanggal.setFont(new Font("Arial",Font.BOLD,14));
        judulHasilTanggal.setForeground(Color.RED);
        judulHasilTanggal.setBounds(90,103,150,30);
        add(judulHasilTanggal);
        
        
        
        lblOut.setText("Tanggal  :");
        lblOut.setFont(new Font("Arial",Font.BOLD,14));
        lblOut.setBounds(10,103,70,30);
        add(lblOut);
        
        lblPlat.setText("Total User:");
        lblPlat.setFont(new Font("Arial",Font.BOLD,14));
        lblPlat.setBounds(10,118,90,30);
        add(lblPlat);
        
        int user = Controller.userR.size();
        judulHasilPlat.setText(user +" User");
        judulHasilPlat.setFont(new Font("Arial",Font.BOLD,14));
        judulHasilPlat.setForeground(Color.RED);
        judulHasilPlat.setBounds(90,118,150,30);
        add(judulHasilPlat);
        
        for(int q=0;q < Controller.lis.size();q++){
        int income1 = Controller.lis.get(q).by.getBiaya();
     
        tIncome = tIncome+income1;
        
        }
        lblDenda.setText("Income  :");
        lblDenda.setBounds(10,133,90,30);
        lblDenda.setFont(new Font("Arial",Font.BOLD,14));
        add(lblDenda);
        
        judulHasilBayar.setText("Rp "+tIncome+",00");
        judulHasilBayar.setBounds(90,133,90,30);
        judulHasilBayar.setFont(new Font("Arial",Font.BOLD,14));
        judulHasilBayar.setForeground(Color.red);
        add(judulHasilBayar);
        
        Submit.setText("Add User");
        Submit.setBounds(450, 88, 100, 25);
        add(Submit);
        
        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
           ControllerVIew cont = new ControllerVIew();
           cont.goToAddUser();
                setVisible(false);
            }
        });
        
        bayar.setBounds(450,116,100,25);
        bayar.setText("Delete User");
        bayar.setFont(new Font("Arial",1,12));
        add(bayar);
        
        bayar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //ControllerVIew it = new ControllerVIew();
                listUser lstU = new listUser();
                lstU.listUser();
                setVisible(false);
            }
        });
        
       admin.setText("See Data");
       admin.setBounds(450,144,100,25);
       admin.setFont(new Font("Arial",1,12));
       add(admin);
       
       admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //ControllerVIew x = new ControllerVIew();
                ViewData viewD = new ViewData();
                
                setVisible(false);
            }
        });
       
       anyar.setText("Dell Data");
       anyar.setBounds(450,173,100,25);
       anyar.setFont(new Font("Arial",1,12));
       add(anyar);
       
       
       
       anyar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                Controller co = new Controller();
                co.DeleteData();
                
                JOptionPane.showMessageDialog(null, "Semua Data Sudah Terhapus...", "Success", JOptionPane.INFORMATION_MESSAGE);
               
            }
        });
       
       logOut.setBounds(10,170,100,25);
       add(logOut);
       
       logOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            ControllerVIew conts = new ControllerVIew();
                conts.goToLoginVIew();
                setVisible(false);
                
            }
        });
        
        setTitle("My Admin");
        myPane.setBackground(new Color(0,191,255));
        myPane2.setBackground(new Color(0,191,255));
        myPane.setBounds(0,0,600,200);
        myPane2.setBounds(0,80,90,120);
        add(myPane);
//        add(myPane2);
        setSize(600,200);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
