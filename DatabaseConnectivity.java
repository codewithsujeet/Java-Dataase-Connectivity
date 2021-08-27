package travel.management.system;

import java.sql.*;

public class Conn {

   Connection con;

   PreparedStatement ps;
   Statement s;
   

    Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //register the driver class 

//create the  connection objcet//"api name:database://server ip address:port/db name","username","password"
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/traveldb", "root", "ilovemybrother");
            s=con.createStatement();
           

         } catch (Exception e) {
           // System.out.println("sql error");
           e.printStackTrace();
           //System.out.println(e.getMessage());
        }
    }

}
