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
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author yogi-06926
 */
public class MainView extends Componnent{
    JCheckBox jcMotor = new JCheckBox();
    JCheckBox jcMobil = new JCheckBox();
    JCheckBox jcKarcis = new JCheckBox();
    JCheckBox jcStnk = new JCheckBox();
    int waktuMasuk,denda1,denda2,mobil,motor;
    int waktuKeluar ;
    int harga,harga1,harga2,nomer=0;
    Controller control=new Controller();
    Date cal;
    String rpDate,typee;
    String tanggal,bulan,tahun,plat;
    DateFormat df;
    
    
    public MainView() {
        boolean ulang = true;
        ActionListener action = new ActionHandler();
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
        
        Submit.setBounds(150, 310, 200, 35);
        add(Submit);
        
        lblHarga.setBounds(20,360,220,30);
        lblHarga.setFont(new Font("Arial",1,20));
        add(lblHarga);
        
//        lblDenda.setBounds(20, 330, 220, 30);
//        lblDenda.setFont(new Font("Arial",1,17));
//        add(lblDenda);
//        
        jcStnk.setBounds(200, 240, 100, 30);
        jcStnk.setText(" STNK ");
        jcStnk.setForeground(Color.BLUE);
        jcStnk.setSelected(true);
        jcStnk.setVisible(true);
        add(jcStnk);
        
        jcMotor.setBounds(300, 240, 100, 30);
        jcMotor.setText(" MOTOR ");
        jcMotor.setForeground(Color.BLUE);
        jcMotor.setVisible(true);
        add(jcMotor);
        
        jcMobil.setBounds(300, 270, 100, 30);
        jcMobil.setText(" MOBIL ");
        jcMobil.setForeground(Color.BLUE);
        jcMobil.setVisible(true);
        add(jcMobil);
        
        jcKarcis.setBounds(200, 270, 100, 30);
        jcKarcis.setText(" Karcis ");
        jcKarcis.setSelected(true);
        jcKarcis.setForeground(Color.BLUE);
        add(jcKarcis);
        
        lblDendaa.setBounds(200, 360, 220, 30);
        lblDendaa.setForeground(Color.RED);
        lblDendaa.setFont(new Font("Arial",1,20));
        add(lblDendaa);
        
        admin.setBounds(280, 500, 200, 35);
        admin.setForeground(Color.BLUE);
        add(admin);
        admin.setVisible(true);
        
        bayar.setBounds(70 , 500, 200, 35);
        bayar.setForeground(Color.RED);
        add(bayar);
        bayar.setVisible(false);
//        lblDenda11.setBounds(150, 370, 220, 30);
//        lblDenda11.setFont(new Font("Arial",1,18));
//        lblDenda11.setForeground(Color.RED);
//        add(lblDenda11);
//        
jcMobil.addActionListener(action);
               System.out.println("Harga + mobil = "+harga1);
               jcMotor.addActionListener(action);
               System.out.println("Harga + motor = "+harga1);
jcKarcis.addActionListener(action);
               System.out.println("Harga + karcis = "+harga2);
               jcStnk.addActionListener(action);
               System.out.println("Harga + stnk = "+harga2);
        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               plat = jtPlat.getText().toString().trim();
               waktuMasuk = Integer.valueOf(jtIn.getText());
               waktuKeluar = Integer.valueOf(jtOut.getText());
                System.out.println("Harga awal = "+harga);
              System.out.println("Harga awal 2 = "+harga2);
               
               harga = ((waktuKeluar-waktuMasuk)*harga1)+harga2;
//               harga = harga+harga2;
               System.out.println("Harga + jumlah = "+harga);
               
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
                typee = jcMobil.getText();
            control.TambahController(plat,typee, tanggal, harga,waktuMasuk,waktuKeluar);
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
                ControllerVIew view = new ControllerVIew();
                setVisible(false);
                view.goToViewData();
                
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
    class ActionHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            JCheckBox checkBox = (JCheckBox) ae.getSource();
            if(checkBox.isSelected()){
                if(checkBox == jcMobil){
                    harga1 = 5000;
                    typee = "Mobil";
                    System.out.println("jcMobil");
                }
                else if(checkBox == jcMotor){
                    harga1 = 3000;
                    typee = "Motor";
                    System.out.println("jcMotor");
                }
                else if(checkBox == jcKarcis){
                    harga2 = harga2;
                    System.out.println("jc3");
                }
                else if (checkBox == jcStnk){
                    harga2 = harga2;
                    System.out.println("jc4");
                }
            }
            else{
                if(checkBox == jcMobil){
                    harga1 = harga1;
                    System.out.println("jc5");
                }
                else if(checkBox == jcMotor){
                    harga1 = harga1;
                    System.out.println("jc6");
                }
                else if(checkBox == jcStnk){
                    harga2= harga2 + 100000;
                    System.out.println("jcStnk");
                }
                else if(checkBox == jcKarcis){
                    harga2 = harga2 + 20000;
                    System.out.println("jcKarcis");
                }
            }
        }
        
    }
}
