package TestPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import java.sql.*;

public class dBConnection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/Girrafe";
		String user="root";
		String password="ssb@2019";
		String query="INSERT INTO student VALUES (7,'Narendra','bio medical',8000)";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection(url,user,password);
		Statement st=con.createStatement();
		int update=st.executeUpdate(query);
		System.out.println("Update done");
	}

}
