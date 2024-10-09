package com.neo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neo.model.Employee;
import com.neo.service.EmployeeService;
import com.neo.service.EmployeeServiceImpl;


@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private EmployeeService empService =new EmployeeServiceImpl();//creating object of interface calss
    public EmployeeServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String action="";
		Integer id= 0;
		if(request.getParameter("eId")!=null) {
			id=Integer.parseInt(request.getParameter("eId"));
		}
		if(request.getParameter("action")!=null) {
			action=request.getParameter("action");
			if(action.equals("delete")) {
				empService.deleteEmployee(id);
				request.setAttribute("msg", "Data deleted successfully");
				RequestDispatcher dispatcher=request.getRequestDispatcher("/pages/list.jsp");
				dispatcher.forward(request,response);
				
			}else if(action.equals("edit")) {
				out.print("...edit action"+id);
				Employee emp=empService.employeeById(id);
				request.setAttribute("empDetail", emp);
				RequestDispatcher dispatcher=request.getRequestDispatcher("/pages/edit.jsp");
				dispatcher.forward(request, response);
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		out.print("From Post");
		
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		Double salary=Double.parseDouble(request.getParameter("salary"));
		Integer age=Integer.parseInt(request.getParameter("age"));
		String email=request.getParameter("email");
		
		out.println(firstName);
		out.println(lastName);
		out.println(salary);
		out.println(age);
		out.println(email);
		
		Employee e = new Employee();
		e.setFirstName(firstName);
		e.setLastName(lastName);
		e.setSalary(salary);
		e.setAge(age);
		e.setEmail(email);
		
		empService.saveEmployee(e);
		
		doGet(request, response);
	}

}
