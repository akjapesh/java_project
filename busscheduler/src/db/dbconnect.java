package db;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class dbconnect {
    public static Connection con;
    public static Connection con1,con2;
    public static Statement st;
     public static Statement st1,st2,st3;
     public static PreparedStatement input,update,delete,read;
   static {
       try{
           con=DriverManager.getConnection("jdbc:sqlite:/home/abhinav/NetBeansProjects/busscheduler/src/db/bookings.db");
           st=con.createStatement();
           input=con.prepareStatement("insert into bookings(name,gender,age,phone,start,stop,type,day,seats) values(?,?,?,?,?,?,?,?,?)");
           update=con.prepareStatement("update bookings set start=?,stop=?,type=?,day=?,seats=?,name=? where phone=?");
           delete=con.prepareStatement("delete from bookings where phone=? ");
           read=con.prepareStatement("select * from bookings where phone=?");
           
       }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
   }
    
}
