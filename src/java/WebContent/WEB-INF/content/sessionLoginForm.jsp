<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SessionArrributesLogin</title>
</head>
<body>
<h3>测试@SessionAttributes</h3>
<br>
<form action="sessionLogin" method="post">
	<table>
		<tr>
			<td><label>登录名：</label></td>
			<td><input type="text" name="loginName" id="loginName"></td>
		</tr>
		<tr>
			<td><label>密码：</label></td>
			<td><input type="password" name="password" id="password"></td>
		</tr>
		<tr>
			<td><input type="submit" id="submit" value="登录"></td>
		</tr>
	</table>
</form>
</body>
</html>