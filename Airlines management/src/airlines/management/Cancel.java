
package airlines.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class Cancel extends JFrame implements ActionListener{
    
    JTextField  tfpnr ;
    JLabel tfname , tflblcode  , lblcancel , labeldate  ;
    JButton fetchbutton,filghts;
   
    public Cancel(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        Random random = new Random();
        
        java.net.URL imgURL = ClassLoader.getSystemResource("airlines/management/icons/cancel.jpg");
        
            ImageIcon i1 = new ImageIcon(imgURL);
            Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
            ImageIcon image1 = new ImageIcon(i2);
      
         JLabel image = new JLabel(image1);
            image.setBounds(470, 120, 250, 250);
            add(image);
        
        
        // customer heading
        
        JLabel heading = new JLabel("CANCELLATION");
        heading.setBounds(180 , 20 ,250, 35);
        heading.setFont((new Font("Tahoma" , Font.PLAIN,32)));
       add(heading);
       
       // flight book details;
       
       
      JLabel lblaadhar = new JLabel("PNR Number");
        lblaadhar.setBounds(60 , 80 ,150, 25);
        lblaadhar.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblaadhar);
       
         tfpnr = new JTextField();
        tfpnr.setBounds(220 , 80 ,150 ,25);
       add( tfpnr);
       
        fetchbutton = new JButton("Show Details");
        fetchbutton.setForeground(Color.WHITE);
           fetchbutton.setForeground(Color.BLACK);
              fetchbutton.setBounds(380 , 80  , 120 , 25);
               fetchbutton.addActionListener(this);
              add(fetchbutton);
       
       
       
       JLabel lblname = new JLabel("Name");
        lblname.setBounds(60 , 130 ,150, 25);
        lblname.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblname);
       
        tfname = new JLabel();
       tfname.setBounds(220 , 130 ,150 ,25);
       add(tfname);
               
               
        JLabel lblcancelnum = new JLabel("Cancellation Number");
        lblcancelnum.setBounds(60 , 180 ,150, 25);
       lblcancelnum.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblcancelnum);
       
        lblcancel = new JLabel("" +random.nextInt(1000000));
       lblcancel.setBounds(220 , 180 ,150 ,25);
       add(lblcancel);
               
               
          
       
       
       
        JLabel lblfilghtcor = new JLabel("Filght Code");
        lblfilghtcor.setBounds(60 , 230 ,150, 25);
        lblfilghtcor.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblfilghtcor);
       
       tflblcode = new JLabel();
        tflblcode.setBounds(220 , 230 ,150 ,25);
       add( tflblcode);
       
       
       
        JLabel lblgender = new JLabel("Date");
        lblgender.setBounds(60 , 280 ,150, 25);
        lblgender.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblgender);
       
       
          labeldate = new JLabel();
        labeldate.setBounds(220 , 280 ,150, 25);
       add(labeldate);
       
       
//        JLabel lblsource = new JLabel("Source");
//        lblsource.setBounds(60 , 330 ,150, 25);
//        lblsource.setFont((new Font("Tahoma" , Font.PLAIN,16)));
//       add(lblsource);
//       
//      lblsrc1 = new Choice();
//       lblsrc1.setBounds(220, 330, 150,25);
//       add(lblsrc1);       
//       
//        JLabel lbldest = new JLabel("Destination");
//        lbldest.setBounds(60 , 380 ,150, 25);
//        lbldest.setFont((new Font("Tahoma" , Font.PLAIN,16)));
//       add(lbldest);
//       
//         lbldest1 = new Choice();
//       lbldest1.setBounds(220, 380, 150,25);
//       add(lbldest1);
//       
//       
//       try {
//           Conn conn= new Conn();
//           
//           String q1 = "select * from flight";
//          ResultSet  rs =conn.statement.executeQuery(q1);
//           
//          while(rs.next()){
//               lblsrc1.add(rs.getString("source"));
//             lbldest1.add(rs.getString("destination"));
//              
//              
//          }
//       }catch(Exception e){
//           e.printStackTrace();
//       }
//       
       
   
       
        filghts = new JButton("Cancel");
        filghts.setForeground(Color.BLACK);
        //  save.setForeground(Color.WHITE);
        filghts.setBounds(220, 320 ,120 ,25);
        filghts.addActionListener(this);
        add(filghts);
        
        
//         JLabel lblflightname = new JLabel("Flight Name ");
//        lblflightname.setBounds(60 , 430 ,150, 25);
//        lblflightname.setFont((new Font("Tahoma" , Font.PLAIN,16)));
//       add(lblflightname);
//       
//       tflblfilghtnme = new JLabel();
//        tflblfilghtnme.setBounds(220 , 430 ,150 ,25);
//       add( tflblfilghtnme);
//       
//       
//        JLabel lblflightcode = new JLabel("Flight Code ");
//        lblflightcode.setBounds(60 , 480 ,150, 25);
//        lblflightcode.setFont((new Font("Tahoma" , Font.PLAIN,16)));
//       add(lblflightcode);
//       
//       tflblflightcode = new JLabel();
//       tflblflightcode.setBounds(220 , 480 ,150 ,25);
//       add( tflblflightcode);
//       
//       
//       JLabel lbldate = new JLabel("Date of Travel ");
//        lbldate.setBounds(60 , 530 ,150, 25);
//        lbldate.setFont((new Font("Tahoma" , Font.PLAIN,16)));
//       add(lbldate);
//       
//      date = new JDateChooser();
//       date.setBounds(220 , 530 ,150 ,25);
//       add( date);
//        
//       
//       
//       
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
        

        setSize(800 , 450);
        setLocation(350 ,150);
        setVisible(true);
    }
     @Override
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == fetchbutton ){
          String pnr  =   tfpnr.getText();
          
           try{
               
               Conn con = new Conn();
               
               String q1 = "select * from  reservation where PNR = '"+ pnr+"'";
                ResultSet rs = con.statement.executeQuery(q1);
               
                 if(rs.next()){
                     tfname.setText(rs.getString("name"));
                      tflblcode.setText(rs.getString("flightcode"));
                       labeldate.setText(rs.getString("ddate"));
                         
                 }else{
                     JOptionPane.showMessageDialog(null, "Please Enter Currect PNR");
               
                 }
               
           }catch(Exception e){
           e.printStackTrace();
           
                }
      }
        else  if(ae.getSource() == filghts ){
          String name = tfname.getText();
          String cancelno = lblcancel.getText();
          String pnr = tfpnr.getText();
          String fcode = tflblcode.getText();
          String ddate = labeldate.getText();

          
          
           try{
               
               Conn con = new Conn();
               
               String q1 = "insert into  cancel values('"+pnr+"', '"+name+"','"+cancelno+"','"+fcode+"','"+ddate+"')";
               con.statement.executeUpdate(q1);
               con.statement.executeUpdate("delete from reservation where PNR = '"+pnr+"'");
               
                 
                     JOptionPane.showMessageDialog(null, "Ticket Canceled");
                setVisible(false);
                 
               
           }catch(Exception e){
           e.printStackTrace();
           
                }
        }
         
      
    }
    public static void main(String[] args){
        new Cancel();
    }

    
}
