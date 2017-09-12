<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.List,org.lanqiao.entity.*"
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
		//ajax验证用户名
		$("input[name='username']").blur(function(){
			$.post("checkUserAjax",{"username":$("input[name='username']").val()},
					function(data){
					alert(data.username+"已存在，请重新输入用户名！");
			},"json")
		});
		$("input[type='date']").change(function() {
			var birth = new Date($("input[type='date']").val());
			var a = birth.getFullYear();
			var nowdate = new Date();
			var b = nowdate.getFullYear();
			$("input[name='age']").val(b-a);
		});
	})
	
</script>
<title>注册页面</title>
</head>
<body>
	<h2 align="center">用户注册</h2>
	<form action="register" method="post">
	<table border="1" align="center">
		<tr><td>用户名</td><td><input type="text" name="username"></td></tr>
		<tr><td>密码</td><td><input type="text" name="password"></td></tr>
		<tr><td>生日</td><td><input type="date" name="birthday"></td></tr>
		<tr><td>年龄</td><td><input type="text" name="age"></td></tr>
		<tr><td>邮箱</td><td><input type="text" name="mail"></td></tr>
		<tr><td colspan="2" align="center"><input type="submit" value="注册用户"></td></tr>
	</table>
	</form>
</body>
</html>