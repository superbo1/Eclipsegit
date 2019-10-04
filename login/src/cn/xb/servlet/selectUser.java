package cn.xb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.xb.entity.User;
import cn.xb.service.StudentService;
import cn.xb.service.StudentServiceImpl;

/**
 * Servlet implementation class selectUser
 */
public class selectUser extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//前端传来的信息
		request.setCharacterEncoding("UTF-8");
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		User user = new User();
		user.setName(uname);
		user.setPwd(upwd);
		
		//后端
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		StudentService studentService = new StudentServiceImpl();
		int rs = studentService.selectUserCount(user);
		if(rs>0) {
			request.setAttribute("name", uname);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else if(rs==0){
			request.setAttribute("error", "error");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			System.out.println("出大问题了 兄弟");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
