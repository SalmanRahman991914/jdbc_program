package jdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		PreparedStatement ps = con.prepareStatement("update school set name='Abid' where id=11");
		int i = ps.executeUpdate();
System.out.println(i);
	} catch (Exception e) {
		System.out.println(e);
	}
	System.out.println("data is updated.....");
}
}
