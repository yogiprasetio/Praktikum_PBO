package Com.ParkingSystem.View;

import Com.ParkingSystem.ControllerObject.Controller;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Com.ParkingSystem.Object.*;
import Com.ParkingSystem.ViewController.ControllerVIew;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author yogi-06926
 */
public class ViewData extends Componnent {
    static Object[] col = {"Type","Plat","Jam Masuk","Jam Keluar","Bayar","Value Date"} ;
    static Object[][] row = {};
    public ViewData()
    {
        Controller k = new Controller();
        DefaultTableModel model = new DefaultTableModel(row, col);
        for(int i = 0; i<Controller.lis.size(); i++)
        {
            model.addRow(new Object[]{Controller.lis.get(i).getType(),Controller.lis.get(i).getPlat(), Controller.lis.get(i).waktu.getIn(), Controller.lis.get(i).waktu.getOut(),Controller.lis.get(i).by.getBiaya(),Controller.lis.get(i).waktu.getTanggal()});
        }
        list = new JTable(model);
        JTableHeader header = list.getTableHeader();
        header.setBackground(Color.YELLOW);
        header.setBounds(20, 10, 760, 20);
        list.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        list.getColumnModel().getColumn(0).setPreferredWidth(10);
        list.getColumnModel().getColumn(1).setPreferredWidth(70);
        list.getColumnModel().getColumn(2).setPreferredWidth(15);
        list.getColumnModel().getColumn(3).setPreferredWidth(15);
        list.getColumnModel().getColumn(4).setPreferredWidth(30);
        list.setCellEditor(null);
        list.setBounds(20, 30, 760, 500);
        
        keluar.setBounds(400, 550, 100, 30);
        keluar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ControllerVIew k = new ControllerVIew();
                k.admin();
                setVisible(false);
            }
        });
        JScrollPane s =  new JScrollPane(list);
        add(s);
        add(header);
        add(list);
        add(keluar);
        setTitle("List Parkir");
        setSize(800, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}
