package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.service.FlightLocal;

/**
 * Servlet implementation class FlightDetails
 */
@WebServlet("/FlightDetails")
public class FlightDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB(beanName="FlightServiceStatelessBean")
	private FlightLocal fs = null;
	
	@EJB(beanName="FlightServiceStatelessBean")
	private FlightLocal fs2 = null;
	
	@EJB(beanName="FlightServiceStatefulBean")
	private FlightLocal fsStateful = null;
	
	@EJB(beanName="FlightServiceStatefulBean")
	private FlightLocal fsStateful2 = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FlightDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("FlightDetails servlet has been called");
        
		//Stateless
		out.println("Flight details: " + fs.getFrom() + " to " + fs.getTo());
		
		fs2.setFrom("Rome"); fs2.setTo("Moscow");
		
		out.println("Flight details: " + fs.getFrom() + " to " + fs.getTo());
		
		//Stateful
		out.println("Flight details: " + fsStateful.getFrom() + " to " + fsStateful.getTo());

		fsStateful2.setFrom("Rome"); fsStateful2.setTo("Moscow");
		
		out.println("Flight details: " + fsStateful.getFrom() + " to " + fsStateful.getTo());
		
		out.println("Flight details: " + fsStateful2.getFrom() + " to " + fsStateful2.getTo());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
