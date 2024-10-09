package com.neo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
      
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		 PrintWriter out=response.getWriter();
//		 out.println("This is get block");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    PrintWriter out=response.getWriter();
	    //out.println("This is post block");
	    
	    String userName=request.getParameter("userName");
	    String password=request.getParameter("password");
	  
	    if(userName.equals("sanjay") && password.equals("shah")) {
	    	out.println("****Welcome****"+userName);
	    	HttpSession session=request.getSession();
	     	session.setAttribute("suname",userName);
		//response.sendRedirect("pages/menu.jsp");
	    	
	    	RequestDispatcher rd=request.getRequestDispatcher("pages/menu.jsp");
	    	rd.forward(request, response);
	    }else {
	    request.setAttribute("msg","Invalid login form servlet!!!");
	    RequestDispatcher rd=request.getRequestDispatcher("/");
	   	rd.forward(request, response);
	}
	    
	}
	}


