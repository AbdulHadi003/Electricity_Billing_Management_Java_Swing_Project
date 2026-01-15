/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricity.billing.system;

import java.sql.*;

/**
 *
 * @author Abdul Hadi
 */
public class connection {
    Connection con;
    Statement s;
    
    public connection(){
        try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/signup","Db-UserName","Your Password");
        s = con.createStatement();
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    
}
}
