package com.test;
import java.sql.*;
import javax.servlet.*;
public class Dao {
     private int k;
   
	public int add(ServletRequest req) {
		try {
		String uname=req.getParameter("uname");
		String pword=req.getParameter("pword");
		String email=req.getParameter("email");
		String phno=req.getParameter("phno");
		Connection con=DBconnection.getCon();
		PreparedStatement ps=con.prepareStatement("insert into test values(?,?,?,?)");
        ps.setString(1,uname);
        ps.setString(2,pword);
        ps.setString(3,email);
        ps.setString(4,phno);
        int k=ps.executeUpdate();
		return k;
	}catch(SQLException e) {
		e.printStackTrace();	}
		return k;

	}
}
