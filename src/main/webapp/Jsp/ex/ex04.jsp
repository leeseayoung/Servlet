<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// 과일 이름 리스트
		List<String> fruitList = new ArrayList<>();
		fruitList.add("사과");
		fruitList.add("바나나");
		fruitList.add("딸기");
	
		
	
	%>

	<table border="1">
		<%for(String fruit:fruitList){ %>
		<tr>
			<td><%= fruit %></td>
		</tr>
	
		<% } %>
	</table>


	<%
	
		//과목 성적 맵 리스트
		
		List<Map<String, Integer>> scoreList = new ArrayList<>();
		
		Map<String, Integer> scoreMap = new HashMap<>();
		
		scoreMap.put("국어", 80);
		scoreMap.put("수학", 90);
		scoreMap.put("영어", 100);
		
		scoreList.add(scoreMap);
	
		scoreMap = new HashMap<>();
		scoreMap.put("국어", 50);
		scoreMap.put("수학", 65);
		scoreMap.put("영어", 70);
		
		scoreList.add(scoreMap);
		
		
	%>
	
	<table border = "1">
		<thead>
			<tr>
				<td>국어</td>
				<td>수학</td>
				<td>영어</td>
			</tr>
		</thead>
		<tbody>
			<% for(Map<String, Integer> score:scoreList) {%>
			<tr>
				<td><%= score.get("국어") %></td>
				<td><%= score.get("수학") %></td>
				<td><%= score.get("영어") %></td>
			</tr>
			<% } %>
			
		</tbody>
	
	</table>
	
	


</body>
</html>