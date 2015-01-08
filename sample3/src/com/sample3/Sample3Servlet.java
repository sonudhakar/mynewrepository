package com.sample3;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Sample3Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		System.out.println("hello ji");
		System.out.println("sonu ji");
	}
}
