<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SessionAttrributes测试页面</title>
</head>
<body>
<h3>@SeesionAttributes测试页面</h3>
<br>
访问request作用域中的的user对象：${requestScope.user.userName}<br>
访问session作用域中的的user对象：${sessionScope.user.userName}<br>
</body>
</html>