package com.penhuin.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex01Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// response
		//캐릭터 셋, 캐릭터 인코딩 UTF-8
		response.setCharacterEncoding("utf-8");
		
		// 데이터 타입 .jpg .png .mp4
		//MIME 규격
		response.setContentType("text/plain");
		
		
		PrintWriter out = response.getWriter();
		out.println("URL Mapping 예제");
		
		
		//현재 날짜 를 response body 에 추가
		// 2023년 08월 01일 17:22:49
		
		Date now = new Date();
		out.println(now);
		
		// 인덕트
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		String dateTimeString = formatter.format(now);
		
		
		out.println(dateTimeString);
		
		
	}
}
