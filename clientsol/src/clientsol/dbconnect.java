/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientsol;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
public class dbconnect {
    public static Connection con;
    public static Statement st;
    public static PreparedStatement inp,upd,read;
    
    
    static {
        try{
         con=DriverManager.getConnection("jdbc:sqlite:/home/abhinav/NetBeansProjects/clientsol/src/clientsol/emp.db");
         st=con.createStatement();
         inp=con.prepareStatement("insert into comp(name,gender,dob,country,address,language) values(?,?,?,?,?,?)");
        upd=con.prepareStatement("update  comp set name=?,gender=?,dob=?,country=?,address=?,language=? where cid=?");
         read=con.prepareStatement("select * from comp where name like ?");
        }catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
        }   
} 
}
