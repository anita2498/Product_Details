package com.hcl.productdetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet0")
public class Servlet0 extends HttpServlet{

	
	
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public Servlet0() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
//			  response.setContentType("text/html");
	//
//		        PrintWriter out = response.getWriter();
//		        out.println("<form action='' method='POST'>");
//		        out.println("<label>Enter Product (Drink) ID: <input type='text' name='drink-id'></input></label>");
//		        out.println("<input type='submit'>Get Details</input>");
//		        out.println("</form>");
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			 String drinkId = request.getParameter("drink-id");
		        PrintWriter out = response.getWriter();
		        DrinkDAO d= new DrinkDAOImpl();
		        DrinkDTO d1 =(d.productInfo((Integer.parseInt(drinkId))));
		        if (d1!=null) {
		        System.out.println("Product found :  "+d1.toString());
		        out.println("Product found <br>");
		        out.println("Product Id : "+ d1.getId()+"<br>");
		        out.println("Product Name : "+ d1.getName()+"<br>");
		        out.println("Product is "+ (d1.isGood()? "Good.":"Bad."));}
		        else 
		        	 out.println("Product not found");
		        
		}
	
}

