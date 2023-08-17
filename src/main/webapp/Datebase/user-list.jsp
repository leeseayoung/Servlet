<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.penhuin.servlet.common.MysqlService" %>    
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 리스트</title>
</head>
<body>
	<%
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
																//이게 지금 미완료
		ResultSet resultSet =  mysqlService.select("SELECT * FROM `user`;");
		
		
	%>
		
	
	<table border="1">
		<thead>
			<tr>
				<th>이름</th>
				<th>생년월일</th>
				<th>취미</th>
			
			</tr>
		</thead>
		<tbody>
		<% while(resultSet.next()) { %>
			<tr>
				<td><%= resultSet.getString("name") %></td>
				<td><%= resultSet.getString("yyyymmdd") %></td>
				<td><%= resultSet.getString("hobby") %></td>
			</tr>
		<% } %>
		</tbody>
	
	
	
	</table>


</body>
</html>