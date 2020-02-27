package com.test;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class LoginServlet extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException{
		{
			try {
			Connection con=DBconnection.getCon();
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			String uname=req.getParameter("uname");
			String pword=req.getParameter("pword");
			PreparedStatement ps=con.prepareStatement("select * from test where username=? and pword=?");
			ps.setString(1, uname);
			ps.setString(2, pword);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
				pw.println("login successfull");
			else
				pw.println("invalid username");
		
		}catch(Exception e) {e.printStackTrace();}
		}
	}

}
