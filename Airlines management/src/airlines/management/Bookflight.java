
package airlines.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;

public class Bookflight extends JFrame implements ActionListener{
    
    JTextField  tfaadhar ;
    JLabel tfname , tflbladdress  ,  lblnationality1 , labelgender ,tflblflightcode ,       tflblfilghtnme ;
    JButton fetchbutton,filghts,Bookfilghts;
     JDateChooser date;
     Choice lblsrc1 , lbldest1;
    public Bookflight(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        // customer heading
        
        JLabel heading = new JLabel("Flight Book");
        heading.setBounds(420 , 20 ,500, 35);
         heading.setForeground(Color.BLUE);
        heading.setFont((new Font("Tahoma" , Font.PLAIN,32)));
       add(heading);
       
       // flight book details;
       
       
      JLabel lblaadhar = new JLabel("Aadhar");
        lblaadhar.setBounds(60 , 80 ,150, 25);
        lblaadhar.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblaadhar);
       
         tfaadhar = new JTextField();
        tfaadhar.setBounds(220 , 80 ,150 ,25);
       add( tfaadhar);
       
        fetchbutton = new JButton("Fetch User");
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
               
               
        JLabel lblnationality = new JLabel("Nationality");
        lblnationality.setBounds(60 , 180 ,150, 25);
        lblnationality.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblnationality);
       
        lblnationality1 = new JLabel();
       lblnationality1.setBounds(220 , 180 ,150 ,25);
       add(lblnationality1);
               
               
          
       
       
       
        JLabel lbladdress = new JLabel("Address ");
        lbladdress.setBounds(60 , 230 ,150, 25);
        lbladdress.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lbladdress);
       
       tflbladdress = new JLabel();
        tflbladdress.setBounds(220 , 230 ,150 ,25);
       add( tflbladdress);
       
       
       
        JLabel lblgender = new JLabel("Gender ");
        lblgender.setBounds(60 , 280 ,150, 25);
        lblgender.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblgender);
       
       
          labelgender = new JLabel("Gender ");
        labelgender.setBounds(220 , 280 ,150, 25);
       add(labelgender);
       
       
        JLabel lblsource = new JLabel("Source");
        lblsource.setBounds(60 , 330 ,150, 25);
        lblsource.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblsource);
       
      lblsrc1 = new Choice();
       lblsrc1.setBounds(220, 330, 150,25);
       add(lblsrc1);       
       
        JLabel lbldest = new JLabel("Destination");
        lbldest.setBounds(60 , 380 ,150, 25);
        lbldest.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lbldest);
       
         lbldest1 = new Choice();
       lbldest1.setBounds(220, 380, 150,25);
       add(lbldest1);
       
       
       try {
           Conn conn= new Conn();
           
           String q1 = "select * from flight";
          ResultSet  rs =conn.statement.executeQuery(q1);
           
          while(rs.next()){
               lblsrc1.add(rs.getString("source"));
             lbldest1.add(rs.getString("destination"));
              
              
          }
       }catch(Exception e){
           e.printStackTrace();
       }
       
       
   
       
        filghts = new JButton("Fatch Flights");
        filghts.setForeground(Color.BLACK);
        //  save.setForeground(Color.WHITE);
        filghts.setBounds(380, 380 ,120 ,25);
        filghts.addActionListener(this);
        add(filghts);
        
        
         JLabel lblflightname = new JLabel("Flight Name ");
        lblflightname.setBounds(60 , 430 ,150, 25);
        lblflightname.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblflightname);
       
       tflblfilghtnme = new JLabel();
        tflblfilghtnme.setBounds(220 , 430 ,150 ,25);
       add( tflblfilghtnme);
       
       
        JLabel lblflightcode = new JLabel("Flight Code ");
        lblflightcode.setBounds(60 , 480 ,150, 25);
        lblflightcode.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblflightcode);
       
       tflblflightcode = new JLabel();
       tflblflightcode.setBounds(220 , 480 ,150 ,25);
       add( tflblflightcode);
       
       
       JLabel lbldate = new JLabel("Date of Travel ");
        lbldate.setBounds(60 , 530 ,150, 25);
        lbldate.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lbldate);
       
      date = new JDateChooser();
       date.setBounds(220 , 530 ,150 ,25);
       add( date);
        
       
       
         java.net.URL imgURL = ClassLoader.getSystemResource("airlines/management/icons/details.jpg");
        
            ImageIcon i1 = new ImageIcon(imgURL);
            Image i2 = i1.getImage().getScaledInstance(450, 320, Image.SCALE_DEFAULT);
            ImageIcon image1 = new ImageIcon(i2);
      
         JLabel image = new JLabel(image1);
            image.setBounds(550, 80, 500, 410);
            add(image);
            
                     
            
              
        Bookfilghts = new JButton("Book Flight");
       Bookfilghts.setForeground(Color.BLACK);
        //  save.setForeground(Color.WHITE);
        Bookfilghts.setBounds(220, 580 ,150 ,25);
        Bookfilghts.addActionListener(this);
        add(Bookfilghts);
        
            
       
       
       
        

        setSize(1100 , 750);
        setLocation(200 ,50);
        setVisible(true);
    }
     @Override
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == fetchbutton ){
          String aadhar  = tfaadhar.getText();
          
           try{
               
               Conn con = new Conn();
               
               String q1 = "select * from  pessenger where aadhar = '"+ aadhar+"'";
                ResultSet rs = con.statement.executeQuery(q1);
               
                 if(rs.next()){
                     tfname.setText(rs.getString("name"));
                      lblnationality1.setText(rs.getString("nationality"));
                        tflbladdress.setText(rs.getString("address"));
                         labelgender.setText(rs.getString("gender"));
                 }else{
                     JOptionPane.showMessageDialog(null, "Please Enter Currect Aadhar");
               
                 }
               
           }catch(Exception e){
           e.printStackTrace();
           
                }
      }
        else  if(ae.getSource() == filghts ){
          String dest = lbldest1.getSelectedItem();
         String src =  lblsrc1.getSelectedItem();

          
          
           try{
               
               Conn con = new Conn();
               
               String q1 = "select * from  flight where source = '"+ src+"' and destination = '"+ dest+"'";
                ResultSet rs = con.statement.executeQuery(q1);
               
                 if(rs.next()){
                     tflblfilghtnme.setText(rs.getString("f_name"));
                     tflblflightcode.setText(rs.getString("f_code"));
                       
                 }else{
                     JOptionPane.showMessageDialog(null, "No Flight Found ?");
               
                 }
               
           }catch(Exception e){
           e.printStackTrace();
           
                }}
           else {
           
                   Random ran = new Random();
                  String aadhar =  tfaadhar.getText();
                 String name =  tfname.getText();
               String nationality =  lblnationality1.getText();
                 String flightname =  tflblfilghtnme.getText();
                 String flightcode = tflblflightcode.getText();
                
             String src =  lblsrc1.getSelectedItem();
             String dest = lbldest1.getSelectedItem();

               String ddate = ((JTextField)date.getDateEditor().getUiComponent()).getText();
          
               
                 try{
               
               Conn con = new Conn();
               
               String q1 = "insert into reservation values('PNR-"+ran.nextInt(1000000)+"' , ' TIC-"+ran.nextInt(1000000)+"' , '"+aadhar+"', '"+name+"', '"+nationality+"' ,  '"+flightname+"',  '"+flightcode+"' ,  '"+src+"' ,  '"+dest+"' ,  '"+ddate+"')";
               con.statement.executeUpdate(q1);
               
             JOptionPane.showMessageDialog(null, "Ticket Booked Successfully ");
               
             setVisible(false);
             
           }catch(Exception e){
           e.printStackTrace();
           
                }
               
                   }
      
    }
    public static void main(String[] args){
        new Bookflight();
    }

    
}
