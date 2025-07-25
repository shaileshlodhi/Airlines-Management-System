
package airlines.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class JeurneyDetails  extends JFrame implements ActionListener{
  JTable table;
   JTextField pnr; 
   JButton show;
    public JeurneyDetails(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
         JLabel lblpnr = new JLabel("PNR Deatils");
        lblpnr.setBounds(50 , 50 ,130, 20);
        lblpnr.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblpnr);
       
       pnr = new JTextField();
       pnr.setBounds(160 , 50 ,120 ,25);
       add( pnr);
       
       show = new JButton("Show Details");
       //show.setForeground(Color.BLACK);
       // show.setForeground(Color.WHITE);
         show.setBounds(290 , 50 ,100, 25);
         show.addActionListener(this);
        add( show);
       
       
       
         table = new JTable();
        
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 800, 150);
        jsp.setForeground(Color.WHITE);
        add(jsp);
        
        setSize(800 , 600);
        setLocation(400 , 150);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        try{
            Conn conn = new Conn();
            
               ResultSet rs = conn.statement.executeQuery("select * from reservation where PNR = '"+pnr.getText()+"'" );
               
               if(!rs.isBeforeFirst()){
               JOptionPane.showMessageDialog(null, "No Information Found ?");
                   return;
            }
           table.setModel(DbUtils.resultSetToTableModel(rs));
           
           
             
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    public static void main(String[] args){
        new JeurneyDetails();
    }
}
