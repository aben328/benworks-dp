package com.javapatterns.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>This is TestServlet.</h1>");
		out.println("<h1>The http request is GET.</h1>");
		out.println("<h2>Now is " + new Date() + "</h2>");

		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>This is TestServlet.</h1>");
		out.println("<h1>The http request is POST.</h1>");
		out.println("<h2>Now is " + new Date() + "</h2>");

		out.close();
	}
}
