package Com.ParkingSystem.View;

import Com.ParkingSystem.ControllerObject.Controller;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Com.ParkingSystem.Object.*;
import Com.ParkingSystem.ViewController.ControllerVIew;

/**
 *
 * @author yogi-06926
 */
public class ViewData extends Componnent {
    String waktuMasuk,waktuKeluar,Bayar,plat,tanggal;
    public int x1=80;
    public int y1=0;
    
    public ViewData(){
        Controller control = new Controller();
        Waktu waktu;
        judul2.setBounds(200, 20, 900, 60);
        judul1.setFont(new Font("Arial",1,24));
        judul1.setBounds(150, 20, 500, 20);
        judul2.setFont(new Font("Arial",1,24));
        add(judul1);
        add(judul2);
        
//        JTable tabel = new JTable(tabelDaata);
//        
//       for(int j=0;j<controller.list.size();j++){
//           Object[] obj= new Object[]{controller.list.get(j).getPlat(),controller.list.get(j).getTanggal(),controller.list.get(j).getWaktuMasuk(),controller.list.get(j).getWaktuKeluar(),controller.list.get(j).getBy()};
//           tabelDaata.addRow(obj);
//       }
//       
//       JScrollPane scroll = new JScrollPane();
//       scroll.setViewportView(tabel);
//       
//       getContentPane().add(scroll);
        judulHasilPlat.setBounds(20, 60, 60, 100);
        judulHasilPlat.setFont(new Font("Arial",Font.BOLD,18));
        add(judulHasilPlat);
        
        judulHasilTanggal.setBounds(100, 60, 150, 100);
        judulHasilTanggal.setFont(new Font("Arial",Font.BOLD,18));
        add(judulHasilTanggal);
        
        judulHasilJamIn.setBounds(300, 60, 180, 100);
        judulHasilJamIn.setFont(new Font("Arial",Font.BOLD,18));
        add(judulHasilJamIn);
        
        judulHasilJamOut.setBounds(430, 60, 180, 100);
        judulHasilJamOut.setFont(new Font("Arial",Font.BOLD,18));
        add(judulHasilJamOut);
        
        judulHasilBayar.setBounds(620, 60, 150, 100);
        judulHasilBayar.setFont(new Font("Arial",Font.BOLD,18));
        add(judulHasilBayar);
        
        for(int j=0;j<(Controller.lis.size());j++){
            JLabel hasilPlat = new JLabel();
        JLabel hasilTanggal = new JLabel();
    JLabel hasilJamIn = new JLabel();
    JLabel hasilJamOut= new JLabel();
    JLabel hasilBayar2 = new JLabel();
//            
            hasilPlat.setText(Controller.lis.get(j).getPlat());
            hasilPlat.setFont(new Font("Consolas",1,14));
            hasilPlat.setBounds(10, x1, 90, 100);
            hasilPlat.setForeground(Color.BLUE);
//            hasilPlat.setVisible(true);
            add(hasilPlat);
            
            hasilTanggal.setText(Controller.lis.get(j).waktu.getTanggal());
            hasilTanggal.setFont(new Font("Consolas",1,14));
            hasilTanggal.setBounds(100, x1, 220, 100);
            hasilTanggal.setForeground(Color.BLUE);
//            hasilTanggal.setVisible(true);
            add(hasilTanggal);
            
            hasilJamIn.setText(String.valueOf(Controller.lis.get(j).waktu.getIn()));
            hasilJamIn.setFont(new Font("Consolas",1,14));
            hasilJamIn.setBounds(300,x1,280,100);
            hasilJamIn.setForeground(Color.BLUE);
//            hasilJamOut.setVisible(true);
            add(hasilJamIn);
            
            hasilJamOut.setText(String.valueOf(Controller.lis.get(j).waktu.getOut()));
            hasilJamOut.setFont(new Font("Arial",1,14));
            hasilJamOut.setForeground(Color.BLUE);
            hasilJamOut.setBounds(430, x1, 320, 100);
            hasilJamOut.setVisible(true);
            add(hasilJamOut);
            
            hasilBayar2.setText(String.valueOf(Controller.lis.get(j).by.getBiaya()));
            hasilBayar2.setFont(new Font("Arial",1,14));
            hasilBayar2.setBounds(620, x1, 350, 100);
            hasilBayar2.setForeground(Color.BLUE);
            hasilBayar2.setVisible(true);
            add(hasilBayar2);
            x1=x1+15;
            
        }
        

        
        Submit.setBounds(20, 570, 90, 20);
        Submit.setText("Kembali");
        Submit.setForeground(Color.RED);
        add(Submit);
        
        
        
        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ControllerVIew vieww = new ControllerVIew();
                setVisible(false);
                vieww.goToMainView();
            }
        });

        setTitle("Lihat Data");
        setForeground(Color.blue);
        setSize(800,600);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
}
