package com.penhuin.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test07")
public class Test07 extends HttpServlet{

		@Override
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		String addressString = request.getParameter("address");
		
		
		String payString = request.getParameter("pay");
		
		String priceString = request.getParameter("price");
		
		
		String addres = addressString.substring(0 , 3);
		
		int price = Integer.parseInt(priceString);
		 
		//contains 포함되어 있다
		out.println("<html><head><title>test07</title></head> <body>");
		
		if(!addres.equals("서울시")) {
			out.println("<h2>배달 불가 지역입니다</h2>");
		} else if(payString.equals("신한카드")) {
			out.println("결제 불가능 카드 입니다.");
		}else {
			out.println(addressString + "배달 준비중"+ "<hr>");
			out.println("결제금액 : " + price + "원");
		}
		
		
		
		
		out.println("</body></html>");
		
	}
}
