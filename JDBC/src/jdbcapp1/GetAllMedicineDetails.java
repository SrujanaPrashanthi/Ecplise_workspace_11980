package jdbcapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetAllMedicineDetails {
	public static void main(String [] args) throws ClassNotFoundException, SQLException {//by passing 
		String driver,url,user,password;
		driver ="com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/edb_12980";
		user = "root";
		password = "root";
		String sql = "select * from medicine";
		
		//1. load the driver
		Class.forName(driver);
		
		//2.establish connection 
		Connection con = DriverManager.getConnection(url,user,password);
		
		//3.create statement method
		Statement st = con.createStatement();
		
		//4.execute select sql query 
		ResultSet rs = st.executeQuery(sql);//Acts as a cursor pointer - for excuting query we use this method
		
		while(rs.next()) {
			System.out.println("medicineName:"+ rs.getString("MedicineName"));
			System.out.println("medicineType:"+rs.getString("MedicineType"));
			System.out.println("dosage:" +rs.getInt("Dosage"));
			System.out.println("manufacturer:"+rs.getString(" Manufacturer"));
			System.out.println("expiryDate:"+rs.getDate("ExpiryDate"));
			System.out.println("price:"+rs.getDouble("price"));
		}
			
		//if return true then it goes to next line if false then it terminates.
		
		//5.close resources
		rs.close();
		st.close();
		con.close();
		
		}
}
