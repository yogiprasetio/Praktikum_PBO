package m4PraktikumDosen.View;

import m4PraktikumDosen.main.controller;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.*;
import m4PraktikumDosen.Controller.ViewController;


/**
 *
 * @author yogi-06926
 */
public class main_view extends Component{
    int waktuMasuk;
    int waktuKeluar ;
    int harga,nomer=0;
    controller control = new controller();
    Date cal;
    String rpDate;
    String tanggal,bulan,tahun,plat;
    DateFormat df;
    
    
    public main_view() {
        boolean ulang = true;
        //logo
        logo.setSize(100,100);
        tampil();
        logo.setBounds(20, 10, 200, 100);
        add(logo);
        
        judul2.setBounds(200, 20, 900, 60);
        judul1.setFont(new Font("Arial",1,24));
        judul1.setBounds(150, 20, 500, 20);
        judul2.setFont(new Font("Arial",1,24));
        add(judul1);
        add(judul2);
        
        
        lblPlat.setBounds(20,120,200,30);
        lblPlat.setFont(new Font("Arial",1,20));
        jtPlat.setBounds(200, 120, 200, 30);
        jtPlat.setFont(new Font("Arial",1,18));
        add(jtPlat);
        add(lblPlat);
        
        
        lblIn.setBounds(20,160,220,30);
        jtIn.setBounds(200, 160, 200, 30);
        lblIn.setFont(new Font("Arial",1,20));
        jtIn.setFont(new Font("Arial",1,18));
        add(lblIn);
        add(jtIn);
        
        lblOut.setBounds(20,200,220,30);
        lblOut.setFont(new Font("arial",1,20));
        jtOut.setBounds(200, 200, 200, 30);
        jtOut.setFont(new Font("Arial",1,18));
        add(lblOut);
        add(jtOut);
        
        Submit.setBounds(150, 240, 200, 35);
        add(Submit);
        
        lblHarga.setBounds(20,290,220,30);
        lblHarga.setFont(new Font("Arial",1,20));
        add(lblHarga);
        
//        lblDenda.setBounds(20, 330, 220, 30);
//        lblDenda.setFont(new Font("Arial",1,17));
//        add(lblDenda);
//        
        lblDendaa.setBounds(200, 290, 220, 30);
        lblDendaa.setForeground(Color.RED);
        lblDendaa.setFont(new Font("Arial",1,20));
        add(lblDendaa);
        
        admin.setBounds(280, 350, 200, 35);
        admin.setForeground(Color.BLUE);
        add(admin);
        admin.setVisible(true);
        
        bayar.setBounds(70 , 350, 200, 35);
        bayar.setForeground(Color.RED);
        add(bayar);
        bayar.setVisible(false);
//        lblDenda11.setBounds(150, 370, 220, 30);
//        lblDenda11.setFont(new Font("Arial",1,18));
//        lblDenda11.setForeground(Color.RED);
//        add(lblDenda11);
//        
        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               plat = jtPlat.getText().toString().trim();
               waktuMasuk = Integer.valueOf(jtIn.getText());
               waktuKeluar = Integer.valueOf(jtOut.getText());
               harga = (waktuKeluar-waktuMasuk)*5000;
               lblDendaa.setText(String.valueOf("Rp. "+harga));
               nomer = nomer++;
               bayar.setVisible(true);
               bayar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                df = new SimpleDateFormat("MM/DD/YYY HH:mm:ss");
                cal = Calendar.getInstance().getTime();
                rpDate = df.format(cal);
                tanggal = rpDate;
            control.tambahParkir(plat, tanggal, waktuMasuk, waktuKeluar, harga);
            jtPlat.setText("");
            jtIn.setText("");
            jtOut.setText("");
            lblDendaa.setText("...");
            waktuMasuk=0;
            waktuKeluar=0;
            harga=0;
            bayar.setVisible(false);
            jtPlat.setFocusable(true);
            
            }
            
            
        });
            }
        });
        
        admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ViewController view = new ViewController();
                setVisible(false);
                view.goToLihatData();
                
//                main_view goMain = new main_view();
            }
        });
        
        setTitle("Parking System");
        setForeground(Color.blue);
        setSize(500,600);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
  
    
}
