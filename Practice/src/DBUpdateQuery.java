import java.io.*;
import java.sql.*;
public class DBUpdateQuery
{
	public static void main(String args[]) throws Exception
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
			PreparedStatement ps=con.prepareStatement("insert into empdata(name, city) values(?,?)");
			ps.setString(1,"Ayush");
			ps.setString(2,"Dhampur");
			ps.executeUpdate();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}