package com.dxc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo_01
 */
public class ServletDemo_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDemo_01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter Out = response.getWriter();
		Out.println("<html>");
		Out.println("<head>");
		Out.println("<title>home</title>");
		Out.println("</head>");
		Out.println("<body>");
		Out.println("<h2>WELCOME TO SERVLET WORLD!!!</h2>");
		Out.println("<h3>LEARNING SERVLET IS FUN</h3>");
		for(int c=0;c<10;c++) {
			if(c%2 == 0) {
				Out.println("<font color =\"green\">"+c+"</font><br>");
			}
			else {
				Out.println("<font color=\"red\">"+c+"</font><br>");
			}
		}
		Out.println("</body>");
		Out.println("</html>");
		
		Out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
