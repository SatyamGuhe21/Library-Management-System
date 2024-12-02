package jframe;


import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author satya
 */
public class dbconnection {
    
    static Connection con = null;
    public static Connection getConnection(){
        String url="jdbc:mysql://localhost:3306/library_ms";
        String uname="root";
        String pass="root";
        try {
//             class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection(url, uname,pass);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    
}
