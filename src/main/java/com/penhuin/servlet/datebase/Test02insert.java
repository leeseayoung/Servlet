package com.penhuin.servlet.datebase;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.penhuin.servlet.common.MysqlService;

@WebServlet("/db/test02-insert")
public class Test02insert extends HttpServlet {
	
		@Override
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

			
			
			
			String name = request.getParameter("name");
			String url = request.getParameter("url");
			
			MysqlService mysqlService = MysqlService.getInstance();
			
			mysqlService.connect();
			
			String query = "INSERT INTO `url_date`\r\n"
					+ "(`name`, `url`)\r\n"
					+ "VALUES\r\n"
					+ "('"+ name +"', '"+ url +"'),;";
			
			
			
			
			
			// 끝
			mysqlService.disconnect();
			
			
			//response로 페이지 이동
			//redirect
			response.sendRedirect("/Datebase/TEST/test02-list.jsp");
		
		
		
	}

}