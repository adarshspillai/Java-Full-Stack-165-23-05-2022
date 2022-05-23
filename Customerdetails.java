package connectionexample;
import java.sql.*;

public class Customerdetails {

	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery("select * from customer_details");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		}
		con.close();
	}catch(Exception e) {
		System.out.println(e);
	}

	}

}
