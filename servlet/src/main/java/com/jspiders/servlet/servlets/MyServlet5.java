package com.jspiders.servlet.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/my_servlet5")
public class MyServlet5 implements Servlet {
	static {
		System.out.println("Servlet is loded");
	}
	{
		System.out.println("object is created");
	}
	

	@Override
	public ServletConfig getServletConfig() {
	
		return null;
	}

	@Override
	public String getServletInfo() {
		
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init() is invoked");
	
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
	 System.out.println("service() is invoked");
	}
	@Override
	public void destroy() {
		System.out.println("destroy() is invoked");
		
		
	}

}
