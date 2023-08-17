package com.penhuin.servlet.datebase;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.penhuin.servlet.common.MysqlService;
@WebServlet("/db/user/insert")
public class UserInsertController extends HttpServlet {
	
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//다른페이지 이동이기 때문에 노필요
//		response.setContentType("text/plain");
		
//		PrintWriter out = response.getWriter();
			
		// 요청에서 전달한 이름, 생년월일, 이메일 정보를 한행을 insert 한다.
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		String hobby = request.getParameter("hobby");
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "INSERT INTO `user`\r\n"
				+ "(`name`, `yyyymmdd`, `hobby`)\r\n"
				+ "VALUE\r\n"
				+ "('" + name + "', '"+ birthday +"', '"+ hobby +"');";
		
		
		int count = mysqlService.update(query);
		
//		out.println("실행결과 : " + count);
		
		mysqlService.disconnect();
		
		
		//response로 페이지 이동
		//redirect
		response.sendRedirect("/Datebase/user-list.jsp");
		
		
		
	}

}
