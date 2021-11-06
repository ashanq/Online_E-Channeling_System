package com.payment.bills;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Appointment
 */
@WebServlet("/Appoinment")
public class Payment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String patientName = request.getParameter("name");
		String special = request.getParameter("special");
		String doctorName = request.getParameter("namee");
		String fee = request.getParameter("amount");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		
		boolean isTrue;
		
		isTrue = customerDb.Appoinment( patientName, special, doctorName, fee,date,time);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("success.jsp");
			dis2.forward(request, response);
		}
		
		
	}


	}

