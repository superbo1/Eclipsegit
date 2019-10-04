<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

    <meta charset="UTF-8">   
    <script type="text/javascript">
        function check() {
            var isPass = true;

            var username = document.getElementById("username");
            var usernameMsg = document.getElementById("usernameMsg");

            var length = username.value.length;
            if(length<3||length>6){
                // alert("用户名长度必须是3-6位");
                usernameMsg.innerText = "用户名长度必须是3-6位";
                isPass=false;
            }

            var email = document.getElementById("eamil").value;
            var emailMsg = document.getElementById("emailMsg");
            p=/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
            if(p.test(email)==false){
                // alert("请输入正确的邮箱格式");
                emailMsg.innerText = "请输入正确的邮箱格式";
                isPass=false;
            }

            var password = document.getElementById("password").value;
            var passwordMsg = document.getElementById("passwordMsg");
            var rePassword = document.getElementById("rePassword").value;
            var rePasswordMsg = document.getElementById("rePasswordMsg");
            if(password.length<5||password.length>10){
                // alert("密码长度必须是5-10位");
                passwordMsg.innerText = "密码长度必须是5-10位";
                isPass=false;
            }else{
                if(password!=rePassword){
                    // alert("密码不一致");
                    rePasswordMsg.innerText = "密码不一致";
                    isPass=false;
                }
            }
            return isPass;
        }
        function checkUsername() {
            var username = document.getElementById("username");
            var usernameMsg = document.getElementById("usernameMsg");

            var length = username.value.length;
            if(length<3||length>6){
                usernameMsg.innerText = "用户名长度必须是3-6位";
            }else{
                usernameMsg.innerText = "";
            }
        }
        function checkEmail() {
            var email = document.getElementById("eamil").value;
            var emailMsg = document.getElementById("emailMsg");
            p=/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
            if(p.test(email)==false){
                emailMsg.innerText = "请输入正确的邮箱格式";
            }else{
                emailMsg.innerText = "";
            }
        }
        function checkPassword() {
            var password = document.getElementById("password").value;
            var passwordMsg = document.getElementById("passwordMsg");
            var rePassword = document.getElementById("rePassword").value;
            var rePasswordMsg = document.getElementById("rePasswordMsg");
            if(password.length<5||password.length>10){
                passwordMsg.innerText = "密码长度必须是5-10位";
            }else{
                passwordMsg.innerText = "";
                if(password!=rePassword){
                    rePasswordMsg.innerText = "密码不一致";
                }else {
                    rePasswordMsg.innerText = "";
                }
            }
        }

    </script>
</head>
<body>
<form  action="addUser" onsubmit="return check()">
    <table border="1" width="500px"  heigth="500px" align="center" >
        <tr><td>用户名:</td><td><input type="text" name="username"  placeholder="请输入用户名" id="username"  onblur="checkUsername()">
            <font color="red" id="usernameMsg"></font>
        </td></tr>
        <tr><td>
        </td></tr>
        <tr><td>
            密码:</td><td><input type="password" name="password"  placeholder="请输入密码" id="password" onblur="checkPassword()">
            <font color="red" id="passwordMsg"></font>
        </td></tr>
        <tr><td>
            确认密码:</td><td><input type="password" name="repassword"placeholder="请再输入密码" id="rePassword" onblur="checkPassword()">
            <font color="red" id="rePasswordMsg"></font>
        </td></tr>
        <tr><td colspan="2" align="center"><input type="submit" value="注册"></td></tr>
    </table>
</form>
<%	String srt = (String)request.getAttribute("No"); 
		if(srt!=null){
		if(srt.equals("No")){
			out.print("因为某些原因注册失败");
		}
		}
		
	%>
</body>
</html>
