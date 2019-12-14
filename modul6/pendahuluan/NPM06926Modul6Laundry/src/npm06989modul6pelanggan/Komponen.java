/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06989modul6pelanggan;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author udin
 */
public class Komponen extends JFrame {

    JLabel lblPegawai = new JLabel("PELANGGAN");
    JLabel lblNama = new JLabel("Nama");
    JLabel lblNoHp = new JLabel("No HP");

    JTextField txtNama = new JTextField();
    JTextField txtNoHp = new JTextField();

    JButton btnInsert = new JButton("Insert");
    JButton btnUpdate = new JButton("Update");
    JButton btnDelete = new JButton("Delete");

    JTable tblPelanggan = new JTable();

}
