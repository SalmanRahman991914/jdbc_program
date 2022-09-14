package jdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Fatch {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
        Statement s=con.createStatement();
        ResultSet r=s.executeQuery("select * from school");
        while(r.next()) {
    	   System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3));
       }
        con.close();
	}
	catch (Exception e) {
		System.out.println(e);
		
	}
	System.out.println("data is inserted");
}
}
