package servlets;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/first")
public class FirstServlet implements Servlet{
	
	private ServletConfig servletConfig;


	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		this.servletConfig = arg0;
		System.out.println("intilizing servlet");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Service Request");
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
		System.out.println("destroying servlet");
		
	}

	
	//non life cycle methods
	
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.servletConfig;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This servlet is created for learning purpose";
	}
	
	

}
