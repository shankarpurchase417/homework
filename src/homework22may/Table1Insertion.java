package homework22may;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Table1Insertion {
	public static void main(String[]args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/homework22may","root","Shankar@1992");
		
		//create statement
		
		//PreparedStatement pst = conn.prepareStatement( " insert into class8(rollNo,sName,Fathername,Address) value('110','aman','raman','jpr')");
		
		//insertion throw postional parameter(?)
		
		PreparedStatement pst = conn.prepareStatement( " insert into class8 values(?,?,?,?)");
		pst.setInt(1, 120);
		pst.setString(2, "raman");
		pst.setString(3,"aman");
		pst.setString(4, "jaipur");
		//execute query
		int i = pst.executeUpdate();
		if(i>0) {
			System.out.println("sucessful insertion");
		} else {
			System.out.println("insertion fail");
		}
	 
	 }
		
	}


