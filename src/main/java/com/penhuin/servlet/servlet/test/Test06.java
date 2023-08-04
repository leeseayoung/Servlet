package com.penhuin.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/test06")
public class Test06 extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		
		//response.setContentType("text/html");
		response.setContentType("application/json");
		
		
		PrintWriter out = response.getWriter();
	
		
		//1숫자 파라미터는 기본 문자열로 저장함
		String number1 = request.getParameter("number1");
		
		int number01 = Integer.parseInt(number1);
	
		
		//2숫자
		String number2 = request.getParameter("number2");
		
		int number02 = Integer.parseInt(number2);
	
		
		//합
		int sum = number01 + number02;
		//빼기
		int subtract = number01 - number02;
		//곱
		int multiply = number01 * number02;
		//나누기 divide
		int divide = number01 / number02;
	
		out.println("{\"addtion\":\"" + sum + ",");
		out.println("{\"subtraction\":\"" + subtract);
		out.println("{\"multiplication\":\"" + multiply);
		out.println("{\"division\":\"" + divide);
		
//		out.println("{\"addtion\":" + sum + 
//					", \"subtraction\":" + subtract + 
//					", \"multiplication\":" + multiply
//					", \"division\":" +  divide + "}");
		
		
	}

}
