<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录操作</title>
</head>
<body>
   <form action="/Test/LoginServlet" method="get">
            用户名：<input type = "text" name="username" />
            <br/> <br/>
            密 码   ：<input type = "password" name = "userpwd"/>
            <br/> <br/>
          <input type = "submit"/>
    </form>
</body>
</html>