package com.payment.bills;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updateDisplay")
public class updateDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public updateDisplay() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String un = request.getParameter("un");
		
		
		
		request.setAttribute("id", id);
		request.setAttribute("name", name);
		request.setAttribute("email", email);
		request.setAttribute("phone", phone);
		request.setAttribute("un", un);

		
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("updateAccount.jsp");
		requestDispatcher.forward(request, response);
		
		
		
		
		
		
		
		
		
		
	}


}
