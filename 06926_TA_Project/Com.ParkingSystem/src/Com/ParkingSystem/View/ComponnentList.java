/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.ParkingSystem.View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicArrowButton;

/**
 *
 * @author yogi-06926
 */
public class ComponnentList extends JFrame {
    
    JLabel hapus = new JLabel("No User Yang Ingin Di Hapus :");
    JTextField isiHpusUser = new JTextField();
    
    JButton ok = new JButton("OKAY...");
    
    
    JTable list;
    JScrollPane scroll = new JScrollPane(); 
    JButton masuk = new JButton("Hapus");
    JButton keluar = new JButton("<- Back");
    
}
