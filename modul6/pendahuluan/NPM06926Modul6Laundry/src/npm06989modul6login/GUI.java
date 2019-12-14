/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06989modul6login;

import java.awt.Font;
import javax.swing.JFrame;

/**
 *
 * @author udin
 */
public class GUI extends Komponen{

    public GUI() {
        
        lblLogin.setBounds(75, 26, 200, 36);
        lblLogin.setFont(new Font("Consolas", Font.BOLD, 24));
        add(lblLogin);
        
        lblUsername.setBounds(12, 75, 75, 24);
        add(lblUsername);
        
        jtxtUsername.setBounds(120, 75, 175, 24);
        add(jtxtUsername);
        
        lblPassword.setBounds(12, 112, 75, 24);
        add(lblPassword);
        
        jtxtPassword.setBounds(120, 112, 175, 24);
        add(jtxtPassword);
        
        btnLogin.setBounds(120, 150, 75, 24);
        add(btnLogin);
        
        btnCancel.setBounds(212, 150, 85, 24);
        add(btnCancel);
        
        setTitle("Login");
        setSize(325, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
}
