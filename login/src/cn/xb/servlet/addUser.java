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
 * Servlet implementation class addUser
 */
public class addUser extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		User user = new User();
		user.setName(name);
		user.setPwd(pwd);
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		StudentService studentService = new StudentServiceImpl();
		boolean flag = studentService.addUser(user);
		if(flag) {
			request.setAttribute("yes", "yes");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			request.setAttribute("No", "No");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
