package com.test;
import java.sql.*;
public class DBconnection {
private static Connection con;
static {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.148:1524:pdborcl","rangasai_dev","psx123");
		
	}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
public static Connection getCon()
{
	return con;
}
}



