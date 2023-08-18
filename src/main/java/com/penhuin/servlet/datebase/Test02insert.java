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
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

			//response.setContentType("text/plain");
			//PrintWriter out = response.getWriter();
			
			// 사이트 이름과 사이트 주소를 전달 받고 ,해당 값을 datebase에 저장한다.
			
			String name = request.getParameter("name");
			String url = request.getParameter("url");
			
			MysqlService mysqlService = MysqlService.getInstance();
			//(접속)
			mysqlService.connect();
			
			String query = "INSERT INTO `url_date`\r\n"
					+ "(`name`, `url`)\r\n"
					+ "VALUES\r\n"
					+ "('"+ name +"', '"+ url +"');";
			
			
			//여기부터 중요(이거 중요)
			mysqlService.update(query);
			
			// out.println("실행결과 : " + count);
			
			// 끝
			mysqlService.disconnect();
			
			
			//response로 페이지 이동
			//redirect
			response.sendRedirect("/Datebase/TEST/test02-list.jsp");
		
		
		
	}

}