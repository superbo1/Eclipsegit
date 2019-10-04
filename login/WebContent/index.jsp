<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="selectUser">
	<table align="center"></table>
	用户名:<input type="text" name="uname"><br/>
	 密码:<input type="password" name="upwd"><br/>
	<input type="submit" value="提交">
	<a href="register.jsp">注册</a><br/>
	</form>
	
	
	<%	String srt = (String)request.getAttribute("error"); 
		if(srt!=null){
		if(srt.equals("error")){
			out.print("登陆失败:用户名或者密码错误");
		}
		}
		
		String srt1 = (String)request.getAttribute("yes"); 
		if(srt1!=null){
			if(srt1.equals("yes")){
				out.print("注册成功！");
			}
			}
	%>
</body>
</html>