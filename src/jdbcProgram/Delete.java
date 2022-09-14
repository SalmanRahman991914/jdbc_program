package jdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
	    PreparedStatement p=con.prepareStatement("Delete from school where id=11");
	    int a=p.executeUpdate();
	    System.out.println(a);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	System.out.println("data is deleted");
}
}
