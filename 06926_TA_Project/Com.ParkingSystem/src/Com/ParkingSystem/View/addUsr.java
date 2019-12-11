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
public class addUsr extends Componnent{

    public addUsr() {
        
        judul1.setBounds(90,05,500,30);
        judul1.setFont(new Font("Consolas",Font.BOLD,32));
        myPane.add(judul1);
        judul2.setText("Tambah Pegawai");
        judul2.setBounds(200,20,500,30);
        judul2.setFont(new Font("Consolas",1,20));
        myPane.add(judul2);
        
        lblIn.setText("Nama          : ");
        lblIn.setBounds(5,85,90,20);
//        lblIn.setHorizontalTextPosition(10);
        lblIn.setFont(new Font("Arial",1,14));
        add(lblIn);
        
        lblOut.setText("UserName  :");
        lblOut.setBounds(5, 107, 90, 20);
        lblOut.setFont(new Font("Arial",1,14));
        add(lblOut);
        
        jtPlat.setBounds(90, 128, 400, 20);
        add(jtPlat);
        
        jtIn.setBounds(90,85,400,20);
        add(jtIn);
        
        jtOut.setBounds(90,107,400,20);
        add(jtOut);
        
        lblPlat.setText("Password   :");
        lblPlat.setBounds(5,128,90,20);
        lblPlat.setFont(new Font("Arial",1,14));
        add(lblPlat);
        
        Submit.setBounds(200, 159, 89, 35);
        add(Submit);
        
        
        
        bayar.setText("Log Out");
        bayar.setFont(new Font("Arial",1,14));
        bayar.setBounds(90,159,89,35);
        add(bayar);
        
        bayar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ControllerVIew conts = new ControllerVIew();
                conts.goToLoginVIew();
                setVisible(false);
            }
        });
        
        setTitle("Add User");
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
