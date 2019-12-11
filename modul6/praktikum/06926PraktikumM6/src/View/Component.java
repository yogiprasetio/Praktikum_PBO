package View;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.colorchooser.AbstractColorChooserPanel;


public class Component extends JFrame {
    JPanel myPanel = new JPanel();
    JLabel judul = new JLabel("Kamus");
    JRadioButton check1 = new JRadioButton();
    JRadioButton check2 = new JRadioButton();
    JLabel kata = new JLabel();
    JComboBox<String> combo = new JComboBox<String>();
    String[] bahasa = {"Kuning","merah","laki"};
    String[] speak = {"yellow","red","laki"};
    JTextField katanya = new JTextField();
    JTextArea sub= new JTextArea();
    
}
