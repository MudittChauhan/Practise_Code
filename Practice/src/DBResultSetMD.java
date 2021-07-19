import java.sql.*;
public class DBResultSetMD 
{
	public static void main(String[] args) throws SQLException
	{
	try 
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from empdata");
	ResultSetMetaData rsmd=rs.getMetaData();
	System.out.println(rsmd.getColumnName(1));		//name
	System.out.println(rsmd.getColumnCount());		//2
	System.out.println(rsmd.getTableName(1));		//
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}

}
