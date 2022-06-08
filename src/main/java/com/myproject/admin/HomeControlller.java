package com.myproject.admin;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/admin-home" })
// nếu k khai báo webservlet ở đây thì phải khai báo bên web xml 
// đoạn mapping cho nó

// bình thường nó sẽ là value="url" nhưng nếu mỗi 1 controller ta lại tạo 1 class
// để mapping đến url thì quá nhiều cho nên t sẽ xài mảng
// urlPatterns
public class HomeControlller extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
