/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06989modul6laundry;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author udin
 */
public class GUI extends Komponen {

    private static String font = "Consolas";

    public GUI() {

        // Label
        label.setBounds(230, 30, 500, 40);
        label.setFont(new Font(font, Font.BOLD, 45));
        label.setForeground(new Color(20, 1, 188));

        // Nama
        nama.setBounds(20, 100, 200,30);
        nama.setFont(new Font(font, Font.BOLD, 17));

        // No HP
        noHp.setBounds(20, 150, 200, 30);
        noHp.setFont(new Font(font, Font.BOLD, 17));

        // Berat
        berat.setBounds(20, 200, 200, 30);
        berat.setFont(new Font(font, Font.BOLD, 17));

        // Berat KG
        beratKg.setBounds(270, 200, 50, 30);
        beratKg.setFont(new Font(font, Font.BOLD, 17));

        // Total
        total.setBounds(20, 250, 150, 25);
        total.setBackground(new Color(2, 200, 255));
        total.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    proses();

                    hasilTotal.setText(String.valueOf(harga));
                    Thread.sleep(1000);
                } catch (Exception ex) {

                }
            }
        });

        // Bayar 
        bayar.setBounds(20, 300, 200, 30);
        bayar.setFont(new Font(font, Font.BOLD, 17));
        bayar.setForeground(new Color(20, 1, 188));

        // Nama
        nm.setBounds(200, 100, 230, 25);
        nm.setFont(new Font(font, Font.BOLD, 17));

        // Nomer
        nomer.setBounds(200, 150, 230, 25);
        nomer.setFont(new Font(font, Font.BOLD, 17));

        // BR
        br.setBounds(200, 200, 60, 25);

        // Hasil Total
        hasilTotal.setBounds(200, 250, 230, 25);
        hasilTotal.setFont(new Font(font, Font.BOLD, 17));

        // byr
        byr.setBounds(200, 300, 230, 25);
        byr.setFont(new Font(font, Font.BOLD, 17));
        byr.setForeground(Color.red);

        // Alert 
        alert.setBounds(200, 445, 230, 25);
        alert.setFont(new Font(font, Font.BOLD, 13));
        alert.setForeground(Color.red);

        // Cetak
        cetak.setBounds(20, 495, 150, 25);
        cetak.setBackground(new Color(68, 255, 71));
        cetak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (byr.getText().equals("")) {
                    byr.setText("Input Jumlah Bayar");
                    alert.setText("");
                } else {
                    bay = Integer.parseInt(new String(byr.getText()));
                    try {
                        CheckError();
                        kembali = bay - harga;
                        alert.setText("");
                        o++;
                        data += o + ". " + nm.getText() + " - " + br.getText() + " KG >> Rp." + harga + "\n";
                        text2.setText(data);
                        text.setText("--------- LAUNDRY ------------\n"
                                + "JASA LAYANAN CUCI KERING SETRIKA PAKAIAN\n"
                                + "---------------------------------\n"
                                + "Nama  : " + nm.getText() + "\n"
                                + "No Hp : " + nomer.getText() + "\n"
                                + "Berat : " + br.getText() + " KG\n"
                                + "TOTAL : Rp." + harga + "\n"
                                + "---------------------------------\n"
                                + "BAYAR    : Rp." + byr.getText() + "\n"
                                + "Kembali  : Rp." + kembali + "\n"
                                + "---------------------------------\n");
                    } catch (Exception exception) {
                        errore();
                    }
                }
            }
        });

        // C
        c.setBounds(386, 495, 43, 25);
        c.setBackground(Color.red);
        c.setForeground(Color.WHITE);
        c.setFont(new Font(font, Font.BOLD, 17));
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nm.setText("");
                nomer.setText("");
                hasilTotal.setText("");
                byr.setText("");
                text.setText("");
                alert.setText("");
            }
        });

        // Text
        text.setBounds(450, 250, 440, 170);
        text.setFont(new Font(font, Font.BOLD, 15));

        // Text 2
        text.setBounds(450, 100, 440, 130);
        text.setFont(new Font(font, Font.BOLD, 14));

        add(label);
        add(nama);
        add(noHp);
        add(berat);
        add(beratKg);
        add(nm);
        add(nomer);
        add(br);
        add(total);
        add(hasilTotal);
        add(bayar);
        add(byr);
        add(alert);
        add(cetak);
        add(c);
        add(text);
        add(text2);
        setTitle("Laundry");
        setSize(930,590);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    private void reset() {
        o += 0;
    }

    private void errore() {
        alert.setText("Bayar Kurang Rp." + (harga - bay));
    }

    private void CheckError() throws IOException {
        if (bay < harga) {
            throw new IOException();
        }
    }

}
