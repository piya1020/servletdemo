package jdbcbasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbctest {
	public static void main(String[] args)
	{
		System.out.println("JDBC test");
		Connection connection;
		Statement statement;
		ResultSet rs;
		
		try {
			 connection=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","root");
			statement=connection.createStatement();
			
			//insert
			//int result=statement.executeUpdate("insert into account values(4,'Priya','Chougule',40000)");
			//System.out.println("Number of rows inserted: " +result);
			
			//update
			//int result=statement.executeUpdate("update account set balance=7000 where accno=3");
			//System.out.println("Number of rows inserted"+result);
			
			//delete
			//int result=statement.executeUpdate("delete from account where accno=1");
			//System.out.println("Number of rows inserted"+result);
			
			rs =statement.executeQuery("select * from account");
			while(rs.next())
			{
				
				System.out.println(rs.getInt(1) +"." +rs.getInt(2) + ","+rs.getInt(3) +":Balance="+rs.getInt(4));
			}
			
			
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
