<%@page import="cn.mvcproject.model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html"  charset="UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html"  charset="UTF-8">
<title>编辑用户</title>
<style >
  tr{height:40px}
  td{padding:10px}
</style>
</head>
<body>
 <% User user =(User)request.getAttribut("user")%>
   <form action="<%=request.getContextPath()%>/update.udo" method="post ">
    <table style="margin-left:100px; padding:50px; border: 1px #ccc solid; width:400px;" >
      <tr>
        <td style="text-align:right">用户名：</td>
        <td style="text-align:left"><input type = "text" name = "username"/></td>
      </tr>
       <tr>
        <td style="text-align:right">用户密码：</td>
        <td style="text-align:left"><input type = "text" name = "pasword"/></td>
      </tr>
      <tr>
        <td style="text-align:right">用户地址：</td>
        <td style="text-align:left"><input type = "text" name = "address"/></td>
      </tr>
      <tr>
        <td style="text-align:right">用户电话：</td>
        <td style="text-align:left"><input type = "text"name = "phoneNo"/></td>
      </tr> 
      <tr>
        <td colspan="2" style="text-align:center"><input type="submit" value="完成"  /></td>
      </tr>
      </table>
     </form>
    </body>
  </html>
      