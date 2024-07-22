package homework22may;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Table2Insertion {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/homework22may","root","Shankar@1992");
		
		PreparedStatement pst =conn.prepareStatement("insert into javaclass values(?,?,?)");
		pst.setString(1, "shankar lal jat");
		pst.setString(2,"msc physics");
		pst.setString(3, "8741898523");
		
		int i = pst.executeUpdate();
		if(i>0) {
			System.out.println("insertion is sucessfull");
		}else {
			System.out.println("fail");
		}
		
	}

}
