/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlines.management;


import java.sql.*;



public class Conn {
    Connection connection;
    Statement statement;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Airlinemanagement","root","sachin@8120"
            );
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

  
