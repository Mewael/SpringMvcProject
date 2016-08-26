package com.dss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter writer = response.getWriter();
	writer.println("This is my frist application");
	
	String name= request.getParameter("uname");
	String pwd= request.getParameter("upwd");
	
	if(name.equals("ratan")&& pwd.equals("ratan")){
//		writer.println("you have loged in successfully");
//		writer.println("user name " + name + "and password " + pwd);
		
		//to redirect the client automatically to another website(but
		//the request is reaching to the sender first
//		response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
//		response.setHeader("location", "https://www.facebook.com");
		
		// here it's redirecting directly to the website
		response.sendRedirect("https://www.facebook.com");
		
	}
	else{
		response.sendError(404, "OOPs! the password and username is wrong");
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
