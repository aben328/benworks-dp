package com.javapatterns.state.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextServlet extends HttpServlet {

	private static final long serialVersionUID = 7279963868150942151L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}

	public void doService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId = request.getParameter("userid");
		String password = request.getParameter("password");
		String btnAction = request.getParameter("btnAction");

		writelogline("before logging");

		if (btnAction.equalsIgnoreCase("log on")) {
			writelogline("logging in");
			this.getState().login(userId, password);
		} else if (btnAction.equalsIgnoreCase("log out")) {
			writelogline("logging out");
			this.getState().logout();
		}
		response.sendRedirect(this.getState().getNextPage());
	}

	public UserState getState() {
		return userState.getCurrentState();
	}

	private static void writelogline(String msg) {
		System.out.println(msg);
	}

	/**
	 * @link aggregation
	 */
	private UserState userState = new LogoutState();
}
