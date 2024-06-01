package DbConnectionExample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.*;


public class DbConnection {
	
	static Connection con;
	static PreparedStatement pstmt;
	static ResultSet rs;
	static Statement st;

	
	public static void main (String args[]) throws Exception
	{
		
		Scanner sc=new Scanner(System.in);
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?useSSL=false","root","root");
			//Statement stmt = con.createStatement(); 
		}
		catch(Exception ex1)
		{
			System.out.println(ex1);
		}
		System.out.println("Enter 1 for Select"+ "\n"+"Enter 2 for Insert"+"\n"+"Enter the value: ");
		int val=sc.nextInt();
		while(val!=0)
		{
			switch(val)
			{
			case 1 : 
			try
			{
				//int result= stmt.executeQuery("select * from employee");
				pstmt = con.prepareStatement("select * from employee;");
				rs=pstmt.executeQuery();
				while(rs.next()) {
			    	System.out.println(rs.getString("id")+"\n"+ rs.getString("empname") +"\n"+ rs.getString("salary"));
			    }
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			finally 
			{
				
			}
			break;
			
			case 2:
				try
				{
					//int result= stmt.executeQuery("select * from employee");
					pstmt = con.prepareStatement("insert into employee(id, empname, salary) values(?,?,?);");
					System.out.println("Enter Employee Name");
					sc.nextLine();
					String empname= sc.nextLine();
					System.out.println("Enter Employee Id");
					int empId=sc.nextInt();
					System.out.println("Enter Employee salary");
					int salary=sc.nextInt();
					pstmt.setInt(1,empId);
					pstmt.setString(2, empname);
					pstmt.setInt(3, salary);
					pstmt.executeUpdate();
					System.out.println("Successfully Inserted");
				} 
				catch(Exception ex)
				{
					System.out.println(ex);
				}
				finally 
				{
					
				}
				break;
			
			}//end switch
			
			System.out.println("Enter 1 for Select"+ "\n"+"Enter 2 for Insert"+"\n"+"Enter the value: ");
			val=sc.nextInt();
		}
		System.out.println("Thank You");

	}

}
