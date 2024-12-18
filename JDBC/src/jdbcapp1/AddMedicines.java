package jdbcapp1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AddMedicines {

	public static void main(String [] args) throws ClassNotFoundException, SQLException {//by passing 
		String driver,url,user,password;
		driver ="com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/edb_12980";
		user = "root";
		password = "root";
		 String sql = "INSERT INTO medicine VALUES (?, ?, ?, ?, ?, ?)";
		//1. load the driver
		Class.forName(driver);
		
		//2.establish connection 
		Connection con = DriverManager.getConnection(url,user,password);
		
		//3.create prepare statement method
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "Multivitamin");
		ps.setString(2, "Capsule");
		ps.setInt(3,  500);
		ps.setString(4,"VitaPlus");
		
		Date expiryDate = Date.valueOf("2026-06-01"); 
		ps.setDate(5,expiryDate);
		
		ps.setDouble(6, 12.00);
		
		//4. execute insert sql query
		int status = ps.executeUpdate();
		if(status >= 1) {
			System.out.println("new medicine is added");
		}else {
			System.out.println("failed");
		}
		ps.close();
		con.close();
		
	}
}
