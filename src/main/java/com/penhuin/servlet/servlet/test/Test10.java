package com.penhuin.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/test10")
public class Test10 extends HttpServlet{

	
	
	private final Map<String, String> userMap =  new HashMap<String, String>() {
		{
			put("id", "hagulu");
			put("password", "asdf");
			put("name", "김인규");
		}
	};	
	
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
	
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		
	
	out.println("<html><head><title>test10</title></head> <body>");
		
	if(userMap.get("id").equals(id)) {
		//out.println("id가 일치합니다.");
	} else {
		out.println("<h1>id가 일치하지 않습니다.</h1>");	
	}  
	
	
	if(userMap.get("password").equals(password)) {
		//out.println("password가 일치합니다.");
	}else {
		out.println("<h1>password가 일치하지 않습니다.<h1>");	
	}
	
	
	if(userMap.get("id").equals(id) && userMap.get("password").equals(password)) {
		out.println( "<h1>"+ userMap.get("name") + "님 환영 합니다.</h1>");
	}
	
	
	
	out.println("</body></html>");
	
	
	
	
	
	}
	
}
