package com.dxc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReqResponse
 */
public class ReqResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReqResponse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Inside of doGet()</h2>");
		out.println("<html>");
		out.println("<head>");

		out.println("<title>userreg</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form method=\"post\">");
		out.println("Name : <input type=\"text\" name=\"name\"><br>");
		out.println("Email : <input type=\"text\" name=\"email\"><br>");
		out.println("Mobile : <input type=\"text\" name=\"mobile\"><br>");
		out.println("<input type=\"submit\"\" value=\"login\">");
		out.println("</form>");

		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String na = request.getParameter("name");
		String em = request.getParameter("email");
		String mo = request.getParameter("mobile");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Inside of doPost()</h2>");
		out.println("Name :"+na+"<br>");
		out.println("Email : "+em+"<br>");
		out.println("Mobile : "+mo+"<br>");
	}

}
