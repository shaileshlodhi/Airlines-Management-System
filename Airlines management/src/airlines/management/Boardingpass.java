
package airlines.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;

public class Boardingpass extends JFrame implements ActionListener{
    
    JTextField   tfpnr ;
    JLabel tfname ,  tflblsrc ,  lblnationality1 , labeldest ,tflblflightcode ,       tflblfilghtnme ,  lbldate1 ;
    JButton fetchbutton;
    // JDateChooser  lbldate;

    public Boardingpass(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        // customer heading
        
        JLabel heading = new JLabel("AIR INDIA");
        heading.setBounds(380 , 0 ,450, 35);
         //heading.setForeground(Color.BLUE);
        heading.setFont((new Font("Tahoma" , Font.PLAIN,32)));
       add(heading);
       
       JLabel subheading = new JLabel("BOARDING PASS");
        subheading.setBounds(360 , 50 ,300, 30);
         subheading.setForeground(Color.BLUE);
        subheading.setFont((new Font("Tahoma" , Font.PLAIN,24)));
       add(subheading);
       
       // flight book details;
       
       
      JLabel lblaadhar = new JLabel("PNR DETAILS");
        lblaadhar.setBounds(60 , 100 ,150, 25);
        lblaadhar.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblaadhar);
       
         tfpnr = new JTextField();
         tfpnr.setBounds(220 , 100 ,150 ,25);
       add(  tfpnr);
       
        fetchbutton = new JButton("ENTER");
        fetchbutton.setForeground(Color.WHITE);
           fetchbutton.setForeground(Color.BLACK);
              fetchbutton.setBounds(380 , 100  , 120 , 25);
               fetchbutton.addActionListener(this);
              add(fetchbutton);
       
       
       
       JLabel lblname = new JLabel("NAME");
        lblname.setBounds(60 , 140 ,150, 25);
        lblname.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblname);
       
        tfname = new JLabel();
       tfname.setBounds(220 , 140 ,150 ,25);
       add(tfname);
               
               
        JLabel lblnationality = new JLabel("NATIONALITY");
        lblnationality.setBounds(60 , 180 ,150, 25);
        lblnationality.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblnationality);
       
        lblnationality1 = new JLabel();
       lblnationality1.setBounds(220 , 180 ,150 ,25);
       add(lblnationality1);
               
               
       
       
        JLabel lbladdress = new JLabel("SRC");
        lbladdress.setBounds(60 , 220 ,150, 25);
        lbladdress.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lbladdress);
       
       tflblsrc = new JLabel();
          tflblsrc.setBounds(220 , 220 ,150 ,25);
       add(tflblsrc);
       
       
       
        JLabel lblgender = new JLabel("DEST");
        lblgender.setBounds(380 , 220 ,150, 25);
        lblgender.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblgender);
       
       
          labeldest = new JLabel();
        labeldest.setBounds(470 , 220 ,150, 25);
       add(labeldest);
       
  
   
       

         JLabel lblflightname = new JLabel("Flight Name ");
        lblflightname.setBounds(60 , 260 ,150, 25);
        lblflightname.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblflightname);
       
       tflblfilghtnme = new JLabel();
        tflblfilghtnme.setBounds(220 , 260 ,150 ,25);
       add( tflblfilghtnme);
       
       
        JLabel lblflightcode = new JLabel("Flight Code ");
        lblflightcode.setBounds(380 , 260 ,150, 25);
        lblflightcode.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblflightcode);
       
       tflblflightcode = new JLabel();
       tflblflightcode.setBounds(480 , 260 ,150 ,25);
       add( tflblflightcode);
       
       
       JLabel lbldate = new JLabel("DATE");
        lbldate.setBounds(60 , 300 ,150, 25);
        lbldate.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lbldate);
       
      lbldate1 = new JLabel();
       lbldate1.setBounds(220 , 300 ,150 ,25);
       add(lbldate1);
        
       
       
         java.net.URL imgURL = ClassLoader.getSystemResource("airlines/management/icons/airindia.png");
        
            ImageIcon i1 = new ImageIcon(imgURL);
            Image i2 = i1.getImage().getScaledInstance(300, 230, Image.SCALE_DEFAULT);
            ImageIcon image1 = new ImageIcon(i2);
      
         JLabel image = new JLabel(image1);
            image.setBounds(600, 0, 300, 300);
            add(image);
//            
//                     
//            
//              
//        Bookfilghts = new JButton("Book Flight");
//       Bookfilghts.setForeground(Color.BLACK);
//        //  save.setForeground(Color.WHITE);
//        Bookfilghts.setBounds(220, 580 ,150 ,25);
//        Bookfilghts.addActionListener(this);
//        add(Bookfilghts);
//        
//            
//       
//       
//       
        

        setSize(1000 , 450);
        setLocation(300 ,150);
        setVisible(true);
    }
     @Override
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == fetchbutton ){
          String pnr  =  tfpnr.getText();
          
           try{
               
               Conn con = new Conn();
               
               String q1 = "select * from  reservation where PNR = '"+pnr+"'";
                ResultSet rs = con.statement.executeQuery(q1);
               
                if(rs.next()){
                     tfname.setText(rs.getString("name"));
                    lblnationality1.setText(rs.getString("nationality")); 
                    tflblsrc.setText(rs.getString("src"));  
                    labeldest.setText(rs.getString("dest")); 
                        tflblfilghtnme.setText(rs.getString("flightname"));
                    tflblflightcode.setText(rs.getString("flightcode"));
                       lbldate1.setText(rs.getString("ddate"));
                     
                 }else{
                     JOptionPane.showMessageDialog(null, "Please Enter Currect PNR");
               
                 }
               
           }catch(Exception e){
           e.printStackTrace();
           
                }
      }
      
    }
    public static void main(String[] args){
        new Boardingpass();
    }

    
}
