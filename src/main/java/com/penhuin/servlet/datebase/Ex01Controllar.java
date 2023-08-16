package com.penhuin.servlet.datebase;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/db/ex01")
public class Ex01Controllar extends HttpServlet {

	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		// 데이터베이스 접속
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			// 서버 주서 ,아이디, 비밀번호
			String url = "jdbc:mysql://localhost:3307/leeseayoung";
			String userId = "root";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url, userId, password);
			Statement statement  = connection.createStatement();
			
			String selectQuery = "SELECT * FROM `used_goods`;";
			ResultSet resultSet = statement.executeQuery(selectQuery);
			
			out.println("<html><head><title>중고물품</title></head> <body>");
			
			while(resultSet.next()) {
				String title = resultSet.getString("title");
				int price = resultSet.getInt("price");
				
				//제목 : 풀스 팝니다. : 30000원
				out.println("<div>제목 : " + title + "가격 : " + price + "</div>");
				
			}
			
			
			out.println("</body></html>");
		
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
