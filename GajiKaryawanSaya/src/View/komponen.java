package View;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;


public class komponen extends JFrame {
    String BpjsYor[]={"Ya","Tidak"};
    String SJabatan[]={"Outsource","SPV","karyawan"};
    JLabel jlNama= new JLabel("Nama");
    JLabel jlJabatan=new JLabel("Jabatan");
    JLabel jlPresensi = new JLabel("Presensi");
    JLabel BPJS = new JLabel("BPJS");
    JTextField jtNama = new JTextField();
    JComboBox jcJabatan = new JComboBox(SJabatan);
    JSpinner tanggal = new JSpinner();
    JComboBox bpjsYoR= new JComboBox(BpjsYor);
    JButton save = new JButton("SAVE");
    JButton cetak = new JButton("Cetak");
    JButton delete = new JButton("Delete");
}
