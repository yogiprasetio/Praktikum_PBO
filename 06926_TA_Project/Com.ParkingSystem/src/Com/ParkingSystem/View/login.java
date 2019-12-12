package Com.ParkingSystem.View;

import java.util.ArrayList;
import Com.ParkingSystem.ControllerObject.Controller;
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
public class login extends Componnent {
    Controller control;
    ControllerVIew cv;
    public login() {
        control = new Controller();
        cv= new ControllerVIew();
        logo.setSize(50,50);
        tampil();
        logo.setBounds(10,10,50,50);
        add(logo);
        
        judul1.setBounds(90,05,500,50);
        judul1.setFont(new Font("Consolas",Font.BOLD,32));
        add(judul1);
        judul2.setBounds(200,30,500,50);
        judul2.setFont(new Font("Consolas",1,24));
        add(judul2);
        
        lblDenda.setText("User Name     : ");
        lblDenda.setBounds(10,80,150,30);
        lblDenda.setFont(new Font("Arial",1,18));
        lblDenda.setForeground(Color.RED);
        add(lblDenda);
        
        lblDenda1.setText("Password       : ");
        lblDenda1.setBounds(10, 115, 150, 30);
        lblDenda1.setFont(new Font("Arial",1,18));
        lblDenda1.setForeground(Color.RED);
        add(lblDenda1);
        
        jtPlat.setBounds(150, 80, 300, 30);
        add(jtPlat);
        
        password.setBounds(150, 115, 300, 30);
        add(password);
        
        admin.setText("LOGIN");
        admin.setFont(new Font("Consolas",1,12));
        admin.setBounds(240, 160 , 110, 30);
        admin.setForeground(Color.BLUE);
        add(admin);
        
        admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String user = jtPlat.getText().trim();
                String pass = password.getText().trim();
                
                if("root".equals(user)&&"toor".equals(pass)){
                        cv.admin();
                        setVisible(false);
                    }
                    
                else if(Controller.userR.isEmpty() != true){
                    user = jtPlat.getText().trim();
                    pass = password.getText().trim();
                   for(int xx=0;xx<Controller.userR.size();xx++){
                    if(user.equals(Controller.userR.get(xx).getId()) && pass.equals(Controller.userR.get(xx).getPassword())){
                        ControllerVIew coz = new ControllerVIew();
                        coz.goToMainView();
                        setVisible(false);
                    }
                    else if(user.equals(Controller.admin.get(xx).getId()) && pass.equals(Controller.admin.get(xx).getPassword())){
                        ControllerVIew cot = new ControllerVIew();
                        cot.goToAddUser();
                    }
                    else{
                        ControllerVIew p = new ControllerVIew();
                        p.Wrong();
                        setVisible(false);
                    }
                   }
                }
            }
        });
        
        myPane.setBackground(new Color(0,191,255));
        myPane.setBounds(0, 0, 550, 200);
        add(myPane);
        setTitle("Welcome...");
        setForeground(Color.blue);
        setBackground(Color.BLUE);
        setSize(550,200);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
