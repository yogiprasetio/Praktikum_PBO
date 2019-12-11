package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author yogi-06926
 */
public class MainView extends Component {
    
    public MainView(){
        judul.setText("Kamus");
        judul.setBounds(270, 10, 200, 50);
        judul.setFont(new Font("Times New Roman",Font.BOLD,32));
        myPanel.add(judul);
        
        combo.setBounds(600, 20, 150, 30);
        combo.addItem("red");
        combo.addItem("blue");
        myPanel.add(combo);
        
        kata.setBounds(20,90,80,30);
        kata.setText("Kata :");
        kata.setFont(new Font("Consolas",Font.BOLD,22));
        myPanel.add(kata);
        
        check1.setText("Inggris - Indonesia");
        check1.setBounds(20, 50, 300, 40);
        check1.setFont(new Font("Consolas",Font.BOLD,20));
        myPanel.add(check1);
        
        check2.setText("Indonesia - Inggris");
        check2.setBounds(400, 50, 300, 40);
        check2.setFont(new Font("Consolas",Font.BOLD,20));
        myPanel.add(check2);
        
        katanya.setBounds(100, 90, 600, 30);
        myPanel.add(katanya);
        
        sub.setBounds(20, 125, 750, 530);
        myPanel.add(sub);
        
        katanya.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                for(int i=0;i<speak.length;i++){
                    if(katanya.getText().equals(speak[i])){
                        
                        sub.setText(bahasa[i].toUpperCase());
                    }
                }
            }
        });
        
        myPanel.setBounds(0,0,800,700);
        add(myPanel);
        setTitle("KAMUS");
        myPanel.setBackground(Color.yellow);
        setSize(800,700);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
