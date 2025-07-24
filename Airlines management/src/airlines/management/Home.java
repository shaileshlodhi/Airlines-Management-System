/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlines.management;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
//import java.swing.ImageIcon;

public class Home extends JFrame implements ActionListener{
    
   
    public Home() {
         setLayout(null);
        
         // front image
        java.net.URL imgURL = ClassLoader.getSystemResource("airlines/management/icons/front.jpg");
        
            ImageIcon i1 = new ImageIcon(imgURL);
            JLabel image = new JLabel(i1);
            image.setBounds(0, 0, 1600, 800);
            add(image);
       
        // front image heading
        JLabel heading = new JLabel("AIR INDIA WELCOME YOU");
        heading.setBounds(500 , 20, 1000 ,40);
       heading.setForeground(Color.BLUE);
        heading.setFont((new Font("Tahoma" , Font.PLAIN,36)));
        image.add(heading);
        
        //manubar in details
        JMenuBar manubar = new JMenuBar();
        setJMenuBar(manubar);
        
        JMenu details = new JMenu("details");
        manubar.add(details);
        
        
        //menu bar firght details
        JMenuItem flightdetails = new JMenuItem("Flight Details");
          flightdetails.addActionListener(this);
        details.add(flightdetails);
        
         JMenuItem customerDetails = new JMenuItem("Add customer Details");
         customerDetails.addActionListener(this);
        details.add(customerDetails);
        
         JMenuItem BookFlight = new JMenuItem("Book Flight");
          BookFlight.addActionListener(this);
        details.add(BookFlight);
        
         JMenuItem journeyDetails = new JMenuItem("Journey Details");
          journeyDetails.addActionListener(this);
        details.add(journeyDetails);
        
         JMenuItem ticketcencellation = new JMenuItem("Cancel Ticket");
         ticketcencellation.addActionListener(this);
        details.add(ticketcencellation);
        
        
        // ticket boarding pass
        
        JMenu ticket = new JMenu("Ticket");
         manubar.add(ticket);
        
        
        //menu bar firght details
        JMenuItem boardingpass = new JMenuItem("Boarding Pass");
          boardingpass.addActionListener(this);
        ticket.add(boardingpass);
       
        
        
        
         setExtendedState(JFrame.MAXIMIZED_BOTH);
       
     setVisible(true);
        
}
    
    @Override
    public void actionPerformed(ActionEvent ae){
       String text = ae.getActionCommand();
       
       if(text.equals("Add customer Details")){
           new AddCustomer();
       }else if(text.equals("Flight Details")){
            new FlightInfo();
       }else if(text.equals("Book Flight")){
            new Bookflight();
       }else if(text.equals("Journey Details")){
            new JeurneyDetails();
       }else if(text.equals("Cancel Ticket")){
          new Cancel() ;
       }else if(text.equals("Boarding Pass")){
          new Boardingpass() ;
       }
    }
    public static void main(String[] args){
        new Home();
    }
}
