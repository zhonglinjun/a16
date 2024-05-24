package com.jslt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testajax")
public class AjaxTestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//дҵ���߼�
		String ax = req.getParameter("a");
		System.out.println(ax);
		
		//����json��ʽ �����ݣ�{"mark":"�ɹ�","stateCode":1111}
		String jsonstr ="{\"mark\":\"�ɹ�\",\"stateCode\":1111}";
		resp.getWriter().write(jsonstr);
		
	}
	
}
