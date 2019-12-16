package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainView extends komponen {

    public MainView() {
        jlNama.setBounds(10,40,30,35);
        add(jlNama);
        
        jtNama.setBounds(60,40,150,35);
        add(jtNama);
        
        jlJabatan.setBounds(10,60,30,35);
        add(jlJabatan);
        
        jcJabatan.setBounds(60 , 60, 80, 35);
        add(jcJabatan);
        
        jlPresensi.setBounds(10,80,30,35);
        add(jlPresensi);
        
        tanggal.setBounds(60,80,40,35);
        add(tanggal);
        
        BPJS.setBounds(10,100,30,35);
        add(BPJS);
        
        bpjsYoR.setBounds(60,100,30,35);
        add(bpjsYoR);
        
        save.setBounds(20, 120, 40, 30);
        add(save);
        
        delete.setBounds(60,120,50,30);
        add(delete);
        
        cetak.setBounds(90,120,50,30);
        add(cetak);
        
        jcJabatan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String jabatan = jcJabatan.getSelectedItem().toString();
            }
        });
        
        
        
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nama = jtNama.getText().trim();
                
            }
        });
        
        
    }
    
}
