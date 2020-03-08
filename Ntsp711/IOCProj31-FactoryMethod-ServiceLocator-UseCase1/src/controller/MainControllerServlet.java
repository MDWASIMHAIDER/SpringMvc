package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.CBFindScoreService;

public class MainControllerServlet extends HttpServlet {
	private ApplicationContext ctx;
	private CBFindScoreService cbs;
	@Override
	public void init() throws ServletException {
		System.out.println("ctrl.................................");
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		cbs=ctx.getBean("service",CBFindScoreService.class);
	}
	@Override
	public  void doGet(HttpServletRequest req,
														HttpServletResponse res) throws
																	ServletException, IOException {
				int mid=0;
				String score=null;
				RequestDispatcher rd=null;
				mid=Integer.parseInt(req.getParameter("mid"));
				score=cbs.findScore(mid);
				req.setAttribute("scoreBoard", score);
				rd=req.getRequestDispatcher("show_score.jsp");
				rd.forward(req, res);
	}

	@Override
	public void doPost(HttpServletRequest req,
													HttpServletResponse res) throws
															ServletException, IOException {
					doGet(req, res);
	}
	@Override
	public void destroy() {
		cbs=null;
		((AbstractApplicationContext) ctx).close();
	}
}
