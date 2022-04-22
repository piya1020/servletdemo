package com.filtersdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


@WebFilter("/DemoServletFilter")
public class DemoServletFilter extends HttpFilter implements Filter {
       
	public void destroy() {
		System.out.println("Filted Destroyed....");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Inside do filter");
		PrintWriter out = response.getWriter();
		out.println("Before Calling DemoServlet");
		chain.doFilter(request, response);
		out.println("After Calling Demo servlet");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter initilized...........");
	}

}
