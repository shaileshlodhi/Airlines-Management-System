
package airlines.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddCustomer extends JFrame implements ActionListener{
    
    JTextField  tfname ,lblnationality1 ,tfaadhar ,tflbladdress ,tflblphone;
    JRadioButton lblmale , lblfemale , other;
    public AddCustomer(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        // customer heading
        
        JLabel heading = new JLabel("ADD CUSTOMER DETAILS");
        heading.setBounds(230 , 20 ,500, 35);
         heading.setForeground(Color.BLUE);
        heading.setFont((new Font("Tahoma" , Font.PLAIN,32)));
       add(heading);
       
       // customer details;
       
       JLabel lblname = new JLabel("Name");
        lblname.setBounds(60 , 80 ,150, 25);
        lblname.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblname);
       
        tfname = new JTextField();
       tfname.setBounds(220 , 80 ,150 ,25);
       add(tfname);
               
               
        JLabel lblnationality = new JLabel("Nationality");
        lblnationality.setBounds(60 , 130 ,150, 25);
        lblnationality.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblnationality);
       
        lblnationality1 = new JTextField();
       lblnationality1.setBounds(220 , 130 ,150 ,25);
       add(lblnationality1);
               
               
          JLabel lblaadhar = new JLabel("Aadhar Number ");
        lblaadhar.setBounds(60 , 180 ,150, 25);
        lblaadhar.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblaadhar);
       
         tfaadhar = new JTextField();
        tfaadhar.setBounds(220 , 180 ,150 ,25);
       add( tfaadhar);
       
       
       
        JLabel lbladdress = new JLabel("Address ");
        lbladdress.setBounds(60 , 230 ,150, 25);
        lbladdress.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lbladdress);
       
       tflbladdress = new JTextField();
        tflbladdress.setBounds(220 , 230 ,150 ,25);
       add( tflbladdress);
       
       
       
        JLabel lblgender = new JLabel("Gender ");
        lblgender.setBounds(60 , 280 ,150, 25);
        lblgender.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblgender);
       
       
       ButtonGroup buttongroup = new ButtonGroup();
       
        lblmale = new JRadioButton("Male");
       lblmale.setBounds(220, 280 , 70 ,25);
      // lblmale.setForeground(Color.WHITE);
       add(lblmale);
       
    
        lblfemale = new JRadioButton("Female");
       lblfemale.setBounds(300, 280 , 70 ,25);
      // lblfemale.setForeground(Color.WHITE);
       add(lblfemale);
       
        other = new JRadioButton("Other");
       other.setBounds(380, 280 , 70 ,25);
      // lblfemale.setForeground(Color.WHITE);
       add(other);
       
       
       buttongroup.add(lblmale);
       buttongroup.add(lblfemale);
       buttongroup.add(other);
       
       
         JLabel lblphone = new JLabel("Phone Number ");
        lblphone.setBounds(60 , 330 ,150, 25);
        lblphone.setFont((new Font("Tahoma" , Font.PLAIN,16)));
       add(lblphone);
       
        tflblphone = new JTextField();
        tflblphone.setBounds(220 , 330 ,150 ,25);
       add( tflblphone);
       
       
       JButton save = new JButton("SAVE");
        save.setForeground(Color.BLACK);
        //  save.setForeground(Color.WHITE);
        save.setBounds(220, 380 ,150 ,30);
        save.addActionListener(this);
        add(save);
        
        
         java.net.URL imgURL = ClassLoader.getSystemResource("airlines/management/icons/emp.png");
        
            ImageIcon i1 = new ImageIcon(imgURL);
            JLabel image = new JLabel(i1);
            image.setBounds(450, 80, 280, 400);
            add(image);
       
       
       
        

        setSize(900 , 600);
        setLocation(300 ,150);
        setVisible(true);
    }
     @Override
    public void actionPerformed(ActionEvent ae){
       try{
           String name = tfname.getText();
           String nationality = lblnationality1.getText();
           String aadhar  = tfaadhar.getText();
           String address = tflbladdress.getText();
           String phone =  tflblphone.getText();
           String gender = null;
           if(lblmale.isSelected()){
               gender = "Male";
           }else if (lblfemale.isSelected()){
               gender = "Female";
           }else{
               gender = "Other";
           }
           
           try{
               
               Conn con = new Conn();
               
               String q1 = "insert into pessenger values('"+name+"' ,'"+nationality+"' , '"+aadhar+"' ,'"+address+"' , '"+phone+"' ,'"+gender+"')";
               con.statement.executeUpdate(q1);
               
                 JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
               
                 setVisible(false);
               
           }catch(Exception e){
           e.printStackTrace();
           
                }
           
       }catch(Exception e){
           e.printStackTrace();
                }
    }
    public static void main(String[] args){
        new AddCustomer();
    }
}
