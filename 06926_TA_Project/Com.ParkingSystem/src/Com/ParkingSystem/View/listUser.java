package Com.ParkingSystem.View;

import Com.ParkingSystem.ControllerObject.Controller;
import Com.ParkingSystem.ViewController.ControllerVIew;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author yogi-06926
 */
public class listUser extends ComponnentList {
 static Object[] col = {"No","Username","Nama","Password"} ;
    static Object[][] row = {};
    public void listUser()
    {
        Controller k = new Controller();
        DefaultTableModel model = new DefaultTableModel(row, col);
        for(int i = 0; i<Controller.userR.size(); i++)
        {
            model.addRow(new Object[]{(i+1),Controller.userR.get(i).getId(), Controller.userR.get(i).getNamaUser(), Controller.userR.get(i).getPassword()});
        }
        list = new JTable(model);
        JTableHeader header = list.getTableHeader();
        header.setBackground(Color.LIGHT_GRAY);
        header.setBounds(20, 10, 500, 20);
        list.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        list.getColumnModel().getColumn(0).setPreferredWidth(15);
        list.getColumnModel().getColumn(1).setPreferredWidth(100);
        list.setCellEditor(null);
        list.setBounds(20, 30, 500, 200);
        
        hapus.setBounds(10,270,250,30);
        add(hapus);
        
        isiHpusUser.setBounds(220, 277, 100, 20);
        add(isiHpusUser);
        
        masuk.setBounds(100, 300, 100, 30);
        masuk.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                int j = Integer.valueOf(isiHpusUser.getText());
                k.deleteUser(j);
                JOptionPane.showMessageDialog(null, "User berhasil dihapus", "Success", JOptionPane.INFORMATION_MESSAGE);
//                setVisible(false);
            }
        });
        keluar.setBounds(340, 300, 100, 30);
        keluar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ControllerVIew k = new ControllerVIew();
                k.admin();
                setVisible(false);
            }
        });
        add(header);
        add(list);
        add(masuk);
        add(keluar);
        setTitle("List User");
        setSize(540, 350);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
