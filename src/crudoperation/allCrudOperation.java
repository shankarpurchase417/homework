package crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class allCrudOperation {
	//connection method
	static Connection ConnectionWithDB()throws Exception{
		// load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//connection create
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/homework22may","root","Shankar@1992");
		//System.out.println("success");
				
		return con;
			}
	//insert the data in the database 
	public void insert()throws Exception{
		 Connection db =ConnectionWithDB();
		 //statement create
		 PreparedStatement pst = db.prepareStatement("insert into class8(sName) value(?)");
		 pst.setString(1, "omprakash ji phq");
		 int i = pst.executeUpdate();
		 if(i>0) {
			 System.out.println("success");
		 }else {
			 System.out.println("fail");
		 }
			}
	//Update operation
	public void update()throws Exception{
		Connection db = ConnectionWithDB();
		//create statement
		PreparedStatement pst = db.prepareStatement("update class8 set sName = ? where rollNo = 103");
		pst.setString(1, "mukesh  buradiya");
		// execute the query
		if(pst.executeUpdate()>0) {
			System.out.println("update success");
		}else {
			System.out.println("update fail");
		}
		
	}
	//read operation
	public void select() throws Exception{
		Connection db = ConnectionWithDB();
		PreparedStatement pst = db.prepareStatement("select * from class8");
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
		}
		
		
	}
	// delete operation
	public void delete()throws Exception{
		Connection db = ConnectionWithDB();
		PreparedStatement pst = db.prepareStatement("delete from class8 where sName = ?");
		pst.setString(1, "mukesh  buradiya");
		//query execution
		if(pst.executeUpdate()>0) {
			System.out.println("delete success");
		}else {
			System.out.println("delete fail");
		}
		
		
	}
	
	
		
	
	
	

}
