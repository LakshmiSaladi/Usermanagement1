package com.test;
import java.sql.*;
import javax.servlet.*;
import java.io.*;
@SuppressWarnings("serial")
public class DeleteServlet extends GenericServlet {
public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException{
try {
	Connection con=DBconnection.getCon();
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	String uname=req.getParameter("uname");
	PreparedStatement ps=con.prepareStatement("delete from test where username=?");
	ps.setString(1,uname);
	int k=ps.executeUpdate();
	if(k>0) {
		pw.println("deleted successflly");
	}
}catch(Exception e) {e.printStackTrace();}
	
	
}
}
