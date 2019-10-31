package com.bridgelabz;
import java.sql.*;
import java.util.Random;

/** this is program to illustrate basic CRUD operation on JDBC
 * simply remove the comment-tag and fire the queries*/

public class SimpleCRUD {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 String url="jdbc:mysql://localhost:3306/database1";
		 String uName="root";
		 String pass="admin";
		 ResultSet rs;
		 
//			Class.forName(className);
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con =DriverManager.getConnection(url, uName, pass);
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery("select * from student");

/**          showing particular field using where clause*/						 
//			 rs = stmt.executeQuery("select name from student where id=1");
			while(rs.next())
			{
/**          showing particular field using name for particular column*/
//				System.out.println(rs.getString("name"));

/**          printing all possible entries in column 1 and 2*/
				System.out.println(rs.getInt(1)+": "+rs.getString(2));


			}
//			int rowsAffected= stmt.executeUpdate("insert into student values(15,'xfr')");		//DML
//			System.out.println("Rows affected: "+rowsAffected);

			PreparedStatement pst =con.prepareStatement("insert into student values(?,?)");     //PreparedStatement
			pst.setInt(1,6);
			pst.setString(2,"vvk");
//			int rowsAffected= pst.executeUpdate();		//DML
			System.out.println("Rows affected: "+rowsAffected);

			//Necessary to close
			stmt.close();
			con.close();
		
	}
}
