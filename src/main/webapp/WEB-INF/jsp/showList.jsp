<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.List,org.lanqiao.entity.*,org.lanqiao.util.*"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/jquery-3.1.0.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("tr:even").css("background-color","#E3E4E5");
		$("table td").css("text-align","center");
	})
	
</script>
<title>showList</title>
</head>
<body>
	<h2 align="center">用户信息列表</h2>
	<table border="1" align="center">
		<tr>
			<th>编号</th>
			<th>用户名</th>
			<th>生日</th>
			<th>年龄</th>
			<th>邮箱</th>
		</tr>

		<c:forEach items="${list}" var="user">
		<tr>
			<td>${user.id}</td>
			<td>${user.username}</td>
			<td><fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd"/></td>
			<td>${user.age}</td>
			<td>${user.mail}</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="7"><h4 align="center"><%=PageController.createPageCode((Integer)request.getAttribute("pageNum"), (Integer) request.getAttribute("maxPage"), "showUser")%></h4></td>
		</tr>
	</table>
</body>
</html>