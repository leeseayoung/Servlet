package com.penhuin.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/ex03")
public class EX03Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		//response.setContentType("text/html");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		
		// 이름과 생년월일을 전달 받고,
		// 이름과 나이를 html로 정리해서 보여준다.
		// 이름과 나이를 json으로 정리해서 보여준다.
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday"); // 20001023
		
		//이거 기억~~
		String yearString = birthday.substring(0, 4);
		int year = Integer.parseInt(yearString);
		
		// 한국 나이
		int age = 2023 - year + 1;
		
//		out.println("<html><head><title>정보<?title></head> <body>");
//		
//		out.println("<h2>이름 : " + name +  "</h2>");
//		out.println("<h2>나이 : " + age + "</h2>");
//		
//		out.println("</body></html>");
		
		// json
		// 문자열 데이터를 표현하는 규격
		// [10, 20]
		// ["name":"김인규", "나이": 29]
		// [{"name": 김인규, "나이": "29"},{"name": "유재석", "나이": "34"}  ]
		
		out.println("{\"name\":\"" + name + "\", \"age\":" + age + "}");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

