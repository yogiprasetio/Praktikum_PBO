/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.ParkingSystem.View;

import Com.ParkingSystem.ViewController.ControllerVIew;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;



/**
 *
 * @author yogi-06926
 */
public class AdminView extends Componnent{

    public AdminView() {
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
        add(lblIn);
        
        lblOut.setText("Tanggal  :");
        lblOut.setFont(new Font("Arial",Font.BOLD,14));
        lblOut.setBounds(10,103,70,30);
        add(lblOut);
        
        lblPlat.setText("Total User:");
        lblPlat.setFont(new Font("Arial",Font.BOLD,14));
        lblPlat.setBounds(10,118,90,30);
        add(lblPlat);
        
        lblDenda.setText("Income  :");
        lblDenda.setBounds(10,133,90,30);
        lblDenda.setFont(new Font("Arial",Font.BOLD,14));
        add(lblDenda);
        
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
        
       admin.setText("See Data");
       admin.setBounds(450,144,100,25);
       admin.setFont(new Font("Arial",1,12));
       add(admin);
       
       anyar.setText("Dell Data");
       anyar.setBounds(450,173,100,25);
       anyar.setFont(new Font("Arial",1,12));
       add(anyar);
       
       logOut.setBounds(10,170,100,25);
       add(logOut);
        
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
