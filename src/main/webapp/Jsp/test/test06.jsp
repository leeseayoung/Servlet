<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장 목록</title>
</head>
<body>

	<%
	
		//장바구니 맵 리스트
		
		List<Map<Integer, String>> shoppingList = new ArrayList<>();
		
		Map<Integer, String> shoppingMap = new HashMap<>();
		
		shoppingMap.put(1, "저지방 우유");
		shoppingMap.put(2, "요플레 4개");
		shoppingMap.put(3, "딸기 1팩");
		shoppingMap.put(4, "삼겹살 300g");
		shoppingMap.put(5, "생수 6개");
		shoppingMap.put(6, "주방 세제");
		
		shoppingList.add(shoppingMap);
	
		
		
	%>
	<table border = "1">
		<h1>장 목록</h1>
			<thead>
				<tr>
					<td>번호</td>
					<td>품목</td>
				</tr>
				
			</thead>
			<tbody>
				<% for(Map<Integer, String> shopping:shoppingList) {%>
				<tr>
					<td><%= shopping.get("저지방 우유") %></td>
					<td><%= shopping.get(1) %></td>
				</tr>
				<tr>
					<td><%= shopping.get("저지방 우유") %></td>
					<td><%= shopping.get(2) %></td>
				</tr>
				<% } %>
				
			</tbody>
			
		
		</table>



</body>
</html>