package Com.ParkingSystem.View;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.*;
import javax.imageio.ImageIO;
/**
 *
 * @author yogi-06926
 */
public class Componnent extends JFrame {
    JCheckBox jcMotor = new JCheckBox();
    JCheckBox jcMobil = new JCheckBox();
    JCheckBox jcKarcis = new JCheckBox();
    JCheckBox jcStnk = new JCheckBox();
    String[] Kolom = {"Plat","Tanggal","Jam Masuk","Jam Keluar","Bayar"};
    JLabel judulHasilTanggal = new JLabel("Tanggal");
    JLabel judulHasilJamIn = new JLabel("Jam Masuk");
    JLabel judulHasilJamOut = new JLabel("Jam Keluar");
    JLabel judulHasilBayar = new JLabel("Bayar");
    
    JLabel judulHasilPlat = new JLabel("Plat");
    JLabel lblPlat = new JLabel("Nomor Plat    :");
    JLabel judul1 = new JLabel("PT. Go Clean Indonesia");
    JLabel judul2= new JLabel("Parking System");
    JLabel logo= new JLabel();
    ImageIcon icon=new ImageIcon("/home/yogi-06926/Praktium/modul4/dosen/06926-m4PraktikumDosen/src/m4PraktikumDosen/View/logo-company-139-1517906246.jpg");
    JLabel lblIn = new JLabel("Jam Masuk    :");
    JLabel lblOut = new JLabel  ("Jam Keluar    :");
    JLabel lblHarga = new JLabel("Tarif              : ");
    JLabel lblDenda = new JLabel("Tidak Ada Stnk: ");
    JLabel lblDenda1 = new JLabel("Karcis Hilang   : ");
    JTextField jtPlat = new JTextField();
    JTextField jtHarga = new JTextField();
    JTextField jtIn = new JTextField();
    JTextField jtOut = new JTextField();
    JLabel lblDendaa = new JLabel("...");//lblDendaa yang aku rubah
    JLabel lblDenda11 = new JLabel();
    JButton bayar= new JButton("Bayar");
    JButton admin = new JButton("ADMINISTRATOR");
    JButton Submit = new JButton("SUBMIT");
    // untuk memanggil gambar
    public static BufferedImage ambilGambar(String ref){
        BufferedImage bimg=null;
        try {
            bimg = ImageIO.read(new File(ref));
        }catch (Exception e){
            e.printStackTrace();
        }
        return bimg;
    }
    //untuk rezize gambar
    public static BufferedImage resize(BufferedImage img,int newW, int newH){
        int w = img.getWidth();
        int h = img.getHeight();
        BufferedImage dimg= dimg = new BufferedImage(newW, newH, img.getType());
        Graphics2D g = dimg.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(img, 0, 0,newW, newH,0,0,w,h,null);
        g.dispose();
        return dimg;
    } 
    //combinasi with jlbel
    public void tampil(){
        String url = "/home/yogi-06926/Praktium/06926_TA_Project/Com.ParkingSystem/src/Com/ParkingSystem/Images/Screenshot from 2019-11-30 15-28-57.png";
        BufferedImage ambilgmbr = ambilGambar(url);
        ImageIcon imageIcon = new ImageIcon(resize(ambilgmbr,logo.getWidth(),logo.getHeight()));
        logo.setIcon(imageIcon);
    }
}
