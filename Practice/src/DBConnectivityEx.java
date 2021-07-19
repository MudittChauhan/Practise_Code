import java.sql.*;
public class DBConnectivityEx
{
	public static void main(String args[]) throws SQLException
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from empdata");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"    "+rs.getString(2));
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}