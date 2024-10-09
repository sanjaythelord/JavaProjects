package com.neo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class intnservlet
 */
@WebServlet("/intnservlet")
public class IntnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IntnServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		String cc=request.getParameter("country");
		String ln=request.getParameter("language");
		Locale locale=null;
		if(cc==null)
			locale=new Locale(ln);
		else
			locale=new Locale(ln,cc);
		out.print("intnVal..."+locale);
		ResourceBundle rb=ResourceBundle.getBundle("ApplicationResource",locale);
		request.setAttribute("resource", rb);
		  RequestDispatcher rd=request.getRequestDispatcher("pages/intn2.jsp");
		   	rd.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
