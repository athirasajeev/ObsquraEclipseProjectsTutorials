package DB_Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Connectioncode {

public static void main(String[] args) throws InstantiationException,IllegalAccessException, ClassNotFoundException, SQLException
{
try
{
String url = "jdbc:mysql://localhost:3306/student_db";
String user = "root";
String password = "";

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(url, user, password);
System.out.println("Connection Successful");
java.sql.Statement stm=con.createStatement();
       ResultSet rs = stm.executeQuery("SELECT * FROM student_mark");
       
       //Display table ////
       while(rs.next())
       {
           //Display values
           System.out.print("ID: " + rs.getInt("Id"));
           System.out.print(" ,  Name: " + rs.getString("Name"));
           System.out.print(" , java: " + rs.getInt("java"));
           System.out.println(" ,  English : " + rs.getInt("English"));
       }
//stm.executeUpdate("insert into student_mark values(17,'Samuel',90,90)");
//System.out.println("Insrted");
stm.close();
con.close();
//System.out.println("Connection closed!");
   }
catch(SQLException e)
{
System.out.println(e.getMessage());
}
}


}



	
