package com.penhuin.servlet.datebase;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.penhuin.servlet.common.MysqlService;

@WebServlet("/db/test01")
public class Test01 extends HttpServlet {

	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
		
		// mysql 얻어온다(접속)
		MysqlService mysqlService = MysqlService.getInstance();
		//데이터베이스 접속
		mysqlService.connect();
		// 조건
		String selectQuery = "SELECT `address`, `area`, `type` FROM `real_estate` \r\n"
				+ "ORDER BY `id` DESC LIMIT 10;";
		

		ResultSet resultSet = mysqlService.select(selectQuery);
		
		
	
		try {		//다음이 있으면 트루 없으면 flase
			while(resultSet.next()) {
				String address = resultSet.getString("address");
				int area = resultSet.getInt("area");
				String type = resultSet.getString("type");
				
				// 매물 주소: + address +, + 면적 : + 타입
				out.println("매물 주소 : " + address + "," + " 면적 : " + area + ", 타입 : " + type);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		

		// 사용이 다되면
		mysqlService.disconnect();
		
		

		
		
	}

}