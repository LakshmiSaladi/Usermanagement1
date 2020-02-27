package com.test;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class UpdateServlet extends GenericServlet {
public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
	try {
		Connection con=DBconnection.getCon();
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String uname=req.getParameter("uname");
		String opword=req.getParameter("opword");
		String npword=req.getParameter("npword");
		PreparedStatement ps=con.prepareStatement("update test set pword=? where username=? and pword=?");
		ps.setString(1,npword);
		ps.setString(2,uname);
		ps.setString(3,opword);
		int k=ps.executeUpdate();
		if(k>0) {
			pw.println("Updated Successfully");
		}else {
			pw.println("details not found");
		}
	}catch(Exception e) {e.printStackTrace();}
}
}
