package com.penhuin.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test05")
public class Test05 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		
		String number = request.getParameter("number");
		
		
		//이거 기억~~
		String numberString = number.substring(0, 1);
		int gugudan = Integer.parseInt(numberString);
		
		
		
		out.println("<html><head><title>구구단</title></head> <body><ul>");
		int sum = 0 ;
		for(int i = 1; i <= 10; i++) {
			sum = gugudan * i;
			out.println("<li>" + gugudan + " X " + i  +  " = " + sum + "</li>");
			
		}
		
		out.println("</ul></body></html>");
		
		
		
	}
}
