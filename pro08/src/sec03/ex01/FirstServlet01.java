package sec03.ex01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first001")
public class FirstServlet01 extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init �޼ҵ� ȣ��");
	}
	public void destroy() {
		System.out.println("destroy �޼ҵ� ȣ��");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		RequestDispatcher dispatch = request.getRequestDispatcher("second");
		dispatch.forward(request, response);
	}

}
