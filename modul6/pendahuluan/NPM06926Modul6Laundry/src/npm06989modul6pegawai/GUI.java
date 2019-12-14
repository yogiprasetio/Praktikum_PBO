/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06989modul6pegawai;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.table.TableColumn;

/**
 *
 * @author udin
 */
public class GUI extends Komponen {

    private static String font = "Consolas";

    public GUI() {

        lblPegawai.setBounds(150, 25, 300, 22);
        lblPegawai.setFont(new Font(font, Font.BOLD, 24));
        add(lblPegawai);

        lblNama.setBounds(24, 75, 150, 34);
        lblNama.setFont(new Font(font, Font.BOLD, 16));
        add(lblNama);

        txtNama.setBounds(150, 75, 238, 34);
        txtNama.setFont(new Font(font, Font.BOLD, 16));
        add(txtNama);

        lblNoHp.setBounds(24, 125, 150, 34);
        lblNoHp.setFont(new Font(font, Font.BOLD, 16));
        add(lblNoHp);

        txtNoHp.setBounds(150, 125, 238, 34);
        txtNoHp.setFont(new Font(font, Font.BOLD, 16));
        add(txtNoHp);

        lblPassword.setBounds(24, 175, 150, 34);
        lblPassword.setFont(new Font(font, Font.BOLD, 16));
        add(lblPassword);

        txtPassword.setBounds(150, 175, 238, 34);
        txtPassword.setFont(new Font(font, Font.BOLD, 16));
        add(txtPassword);

        btnInsert.setBounds(24, 225, 112, 34);
        btnInsert.setFont(new Font(font, Font.BOLD, 16));
        add(btnInsert);

        btnUpdate.setBounds(148, 225, 112, 34);
        btnUpdate.setFont(new Font(font, Font.BOLD, 16));
        add(btnUpdate);

        btnDelete.setBounds(274, 225, 112, 34);
        btnDelete.setFont(new Font(font, Font.BOLD, 16));
        add(btnDelete);

        tblPegawai.setBounds(24, 275, 360, 125);
        tblPegawai.setFont(new Font(font, Font.BOLD, 16));
        add(tblPegawai);

        setTitle("Pegawai");
        setSize(425, 450);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}
