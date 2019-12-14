/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06989modul6laundry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author udin
 */
public class Komponen extends JFrame {

    JLabel label = new JLabel("---- LAUNDRY ----");
    JLabel nama = new JLabel("Nama Pelanggan : ");
    JLabel noHp = new JLabel("Nomor HP : ");
    JLabel berat = new JLabel("Berat Cucian : ");
    JLabel beratKg = new JLabel("KG");
    JLabel bayar = new JLabel("BAYAR : ");
    JLabel alert = new JLabel();
    
    JTextField nm = new JTextField();
    JTextField nomer = new JTextField();
    JTextField br = new JTextField();
    JButton total = new JButton("TOTAL");
    JTextField hasilTotal = new JTextField();
    JTextField byr = new JTextField();
    JButton cetak = new JButton("CETAK");
    JButton c = new JButton("C");
    
    JTextPane text =  new JTextPane();
    JTextPane text2 =  new JTextPane();
    protected String pro = "";
    protected String metode = "";
    protected String data = "";
    protected int harga;
    protected int kembali = 0;
    protected int bay;
    protected int o = 0;
    
    Thread t = Thread.currentThread();
    
    public void proses(){
        harga = Integer.parseInt(br.getText()) * 15000;
    }
    
    

}
