package com.jspiders.servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/my_servlet1")
public class MyServlet1 extends GenericServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name= req.getParameter("Dnyaneshwar");
		String email= req.getParameter("dnyaneshwarbansode4488@gmail.com");
		res.setContentType("text/html");
		PrintWriter writer= res.getWriter();
		writer.println("<h1>Hello"+name+", your email is "+email + "</h1>");
	}
	
	

}
