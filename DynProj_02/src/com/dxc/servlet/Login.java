package com.dxc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		showLoginForm(response,false);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		    response.setContentType("text/html");
		    PrintWriter out = response.getWriter();
			String un = request.getParameter("username");
			String pw = request.getParameter("password");
			if(validate(un , pw)) {
				HttpSession session = request.getSession(true);
				session.setAttribute("username" , un);
				session.setAttribute("password", pw);
				RequestDispatcher rd = request.getRequestDispatcher("success");
				rd.forward(request,response);
			}
			else {
				showLoginForm(response,true);
			}
			out.close();
	}
	
	private boolean validate(String un , String pw) {
		if(un.equals("sai") && pw.equals("karthik")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	protected void showLoginForm(HttpServletResponse response, boolean error) throws  IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");

		out.println("<title>login</title>");
		out.println("</head>");
		out.println("<body>");
		if (error) {
			out.println("<h2>Invalid username or password or both</h2>");
		}
		out.println("<form method =\"post\">");
		out.println("User name : <input type=\"text\" name=\"username\"><br>");
		out.println("Password : <input type=\"password\" name=\"password\"><br>");
		out.println("<input type=\"submit\" value=\"login\">");
		out.println("<input type=\"reset\"\" name=\"cancel\">");
		out.println("</form>");

		out.println("</body>");
		out.println("</html>");
		
		
		
		//out.close();
	}
}
