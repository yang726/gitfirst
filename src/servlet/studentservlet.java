package servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.student;
import service.studentservice;

public class studentservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String id=req.getParameter("id");
		student s=new student();
		s.setId("56");
		System.out.println("Öí¶ù³æ");
	studentservice stud=new studentservice();
		  Map<String, List> list=stud.getLists(s);
	      
	      if(list!=null) {
	    	  System.out.println("ÖØÖý¶þ");
           	 req.getSession().setAttribute("list",list);
	    	  req.getRequestDispatcher("information.jsp").forward(req, resp);
	    }else {
	    	resp.sendRedirect("landing.jsp");
	    }
	}

}
