/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06989modul6pegawai;

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

    JLabel lblPegawai = new JLabel("PEGAWAI");
    JLabel lblNama = new JLabel("Nama");
    JLabel lblNoHp = new JLabel("No HP");
    JLabel lblPassword = new JLabel("Password");

    JTextField txtNama = new JTextField();
    JTextField txtNoHp = new JTextField();
    JTextField txtPassword = new JTextField();

    JButton btnInsert = new JButton("Insert");
    JButton btnUpdate = new JButton("Update");
    JButton btnDelete = new JButton("Delete");

    JTable tblPegawai = new JTable();

}
