package com.penhuin.servlet.datebase;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.penhuin.servlet.common.MysqlService;
@WebServlet("/db/test02/delete")
public class Delete extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
//		response.setContentType("text/plain");
		
//		PrintWriter out = response.getWriter();
		
		// 전달 받은 id에 대응하는 행을 삭제하는 기능
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		//(접속 과정)
		MysqlService mysqlService = MysqlService.getInstance();
		
		mysqlService.connect();
		
		String query = "DELETE FROM `url_date` WHERE `id` = " + id + ";";
		// 이걸로 수행
		int count = mysqlService.update(query);
		
		//out.println("실행결과 : " + count);
		
		
		//response로 페이지 이동
		//redirect
		response.sendRedirect("/Datebase/TEST/test02-list.jsp");
		
		
		
	}
}
