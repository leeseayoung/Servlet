<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test01</title>
</head>
<body>
	
	<h1>1번 문제</h1>
	<%
	int sum = 0;
	
	int[] scores = {80, 90, 100, 95, 80};
	for(int i = 0; i < scores.length; i++){
		sum += scores[i];		
	}
	double average = sum/(double)scores.length;
	
	%>
	<%-- <h3>합계 : <%= sum %></h3> --%>
	<h3>점수 평균은 : <%= average %></h3>




	<h1>2번 문제</h1>
	<%
		List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
		int score = 0;
		for(String answer:scoreList) {
			if(answer.equals("O")){
				score += 10;
			}
		}
	 
	 
	%>
	

	<h4>채점 결과는 <%= score %> 점 입니다.</h4>


	<h1>3번 문제</h1>
	
	<%! 
	
	public int caluculateSum(int number){
		int sum = 0;
		for(int i = 1; i <= number; i++){
			sum += i;
		}
		return sum;
	}
	

	%>

	<h4>1부터 50까지의 합은<%= caluculateSum(50) %></h4>





	<h1>4번 문제</h1>
	
	<%
	String birthDay = "20010820";
	
	String birthDayString = birthDay.substring(0 , 4);
	int year = Integer.parseInt(birthDayString);
	
	// int year1 = Integer.parseInt(birthDay.substring(0 , 4));
		
	int age = 2023 - year - 1;
	%>
	<h4><%=birthDay + "의 나이는 " + age + "살 입니다." %></h4>

	
</body>
</html>