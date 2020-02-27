package com.test;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class ViewServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException{
		{
			try {
			Connection con=DBconnection.getCon();
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from test");
			while(rs.next()) {
				pw.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"   "+rs.getString(4));
			 pw.println("<br>");
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
