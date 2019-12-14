/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06989modul6login;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author udin
 */
public class Komponen extends JFrame{
    JLabel lblLogin = new JLabel("Silahkan Login");
    JLabel lblUsername = new JLabel("Username");
    JLabel lblPassword = new JLabel("Password");
    
    JTextField jtxtUsername = new JTextField();
    JPasswordField jtxtPassword = new JPasswordField();
    
    JButton btnLogin = new JButton("Login");
    JButton btnCancel = new JButton("Cancel");
}
