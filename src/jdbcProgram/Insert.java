package jdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
	PreparedStatement p=
			con.prepareStatement("insert into school(id,name,address)values(?,?,?)");
	p.setInt(1,15);
	p.setString(2,"Razzaque");
	p.setString(3,"Khalilabad");
	int i=p.executeUpdate();
	System.out.println(i);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	System.out.println("data is inserted");
}
}
