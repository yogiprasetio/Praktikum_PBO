/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.ParkingSystem.View;

import Com.ParkingSystem.ViewController.ControllerVIew;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author yogi-06926
 */
public class WRONG extends Componnent {

    public WRONG() {
    
        judul1.setText("Username or Password is WRONG!!");
        judul1.setForeground(Color.RED);
        judul1.setBounds(10,5,295,30);
        add(judul1);
        
        Submit.setBounds(100, 50, 90, 30);
        add(Submit);
        
        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ControllerVIew cvv = new ControllerVIew();
                cvv.goToLoginVIew();
                setVisible(false);
            }
        });
        
        myPane.setBackground(Color.YELLOW);
        myPane.setBounds(0,0,300,100);
        add(myPane);
        setTitle("CAUTIONS..!!!");
        setSize(280,100);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
