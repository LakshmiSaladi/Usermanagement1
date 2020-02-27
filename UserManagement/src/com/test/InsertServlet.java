package com.test;
import java.io.*;
import javax.servlet.*;

@SuppressWarnings("serial")
public class InsertServlet extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException{
		{
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			Dao d=new Dao();
			int k=d.add(req);
			if(k>0) {
				pw.println("inserted successfully");
			}else {
				pw.println("Not inserted");
			}
		}
	}
}
