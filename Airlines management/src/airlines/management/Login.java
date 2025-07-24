/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlines.management;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton reset , submit , close;
    JTextField tfusername;
     JPasswordField tfpassword;
    
    public Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //Username 
        JLabel lblusername = new JLabel ("Username");
        lblusername.setBounds(20,20, 100 ,20);
        add(lblusername);
        
        // password
         JLabel lblpassword = new JLabel ("Passowrd");
        lblpassword.setBounds(20,60, 100 ,20);
        add(lblpassword);
        
        // text field username
         tfusername = new  JTextField("");
        tfusername.setBounds(130 ,20 ,200, 20);
        add(tfusername);
        
        
        tfpassword = new  JPasswordField("");
        tfpassword.setBounds(130 ,60 ,200, 20);
        add(tfpassword);
        
        
        //button reset 
        
        reset = new JButton("Reset");
        reset.setBounds(40 ,120 ,120 ,20);
        add(reset);
        reset.addActionListener(this);
        
        //Button submit 
        
       submit = new JButton("Submit");
        submit.setBounds(190 ,120 ,120 ,20);
        add(submit);
        submit.addActionListener(this);
        
        // button close
        
          close = new JButton("Close");
        close.setBounds(120 ,160 ,120 ,20);
        add(close);
        close.addActionListener(this);
        
        
        
        
        
        setSize(400, 250);
        setLocation(600 , 250);
     setVisible(true);
        
}
    
    @Override
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()== submit){
           String username = tfusername.getText();
           String password =   tfpassword.getText();
           
           
           try{
           Conn c = new Conn();
           
           String q1 = "select * from Login where username  ='"+username+"' and password = '"+password +"'";
          ResultSet rs =  c.statement.executeQuery(q1);
          
          if(rs.next()){
         new Home();
          setVisible(false);
          }
          else{
               JOptionPane.showMessageDialog(null, "Invalid username and password");          }
               setVisible(false);
               
           }catch(Exception e){
               e.printStackTrace();
           }
       } else if(ae.getSource() == close){
           setVisible(false);
       }else if(ae.getSource() == reset){
           tfusername.setText("");
            tfpassword .setText("");
           
           
       }
        
    }
    public static void main(String[] args){
        new Login();
    }
}
