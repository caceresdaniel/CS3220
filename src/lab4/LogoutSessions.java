package lab4;

import java.io.IOException;
<<<<<<< HEAD
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
=======

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
>>>>>>> 526ef2923b06d9bc1fef9602eba99c549560945c
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD

@WebServlet("/sessions/Logout")
public class LogoutSessions extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
=======
@WebServlet("/sessions/Logout")
public class LogoutSessions extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie cookie = new Cookie("student", "");
		cookie.setMaxAge(0);
		response.addCookie(cookie);

>>>>>>> 526ef2923b06d9bc1fef9602eba99c549560945c
		request.getSession().invalidate();
		response.sendRedirect("Login");
	}

<<<<<<< HEAD
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
=======
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
>>>>>>> 526ef2923b06d9bc1fef9602eba99c549560945c
		doGet(request, response);
	}

}
