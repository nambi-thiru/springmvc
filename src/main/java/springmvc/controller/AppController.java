package springmvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springmvc.dao.UserDao;
import springmvc.dto.User;

@Controller
public class AppController {
	
	@Autowired
	UserDao dao;
	
	@RequestMapping("/test")
	public void test(HttpServletResponse res) throws IOException {
		PrintWriter pw = res.getWriter();
		pw.print("Hi Helooo");
	}
	
	@RequestMapping("/signup")
	public ModelAndView signupUser() {
		ModelAndView view = new ModelAndView();
		view.addObject("user",new User());
		view.setViewName("register.jsp");
		return view;
	}
	
//	@RequestMapping("/save")
//	public ModelAndView saveUser(@ModelAttribute User user) {
//		dao.saveUser(user);
//		ModelAndView view = new ModelAndView();
//		view.setViewName("login.jsp");
//		return view;
//	}
	
	

}
