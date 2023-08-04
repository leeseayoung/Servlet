package com.penhuin.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test03 extends HttpServlet{
		
		@Override
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  {
			
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html");
			// 바디에 채우고 가져오는
			PrintWriter out = response.getWriter();
			
			
			Date now = new Date();
			
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			
			String dateTimeString = formatter.format(now);
			
			out.println("<html><head><title>[단독]</title></head> <body>");
			out.println("<h1>[단독] 고양이가 야옹해</h1>");
			out.println("<div>기사 입력시간 : " +  dateTimeString + "</div>" + "<hr><div>끝</div> </body></html> ");
			
			
		}
		
		
	
	
}
