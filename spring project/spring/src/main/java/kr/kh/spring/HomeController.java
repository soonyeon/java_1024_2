package kr.kh.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/")
	public ModelAndView home(ModelAndView mv,String name, Integer age) {
		System.out.println(name);
		mv.addObject("name1",name);
		mv.addObject("age",age);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/board/{num}")
	public ModelAndView board(ModelAndView mv,@PathVariable("num")Integer num1) {
		System.out.println("게시글 번호 : " + num1); 
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/test")
	public ModelAndView home(ModelAndView mv,InfoVo info) {
		mv.addObject("info1",info);
		mv.setViewName("home2");
		return mv;
	}
	
	@RequestMapping(value = "/login",method=RequestMethod.GET)
	public ModelAndView login(ModelAndView mv) {
		mv.setViewName("login"); //화면 이름
		return mv;
	}
	@RequestMapping(value = "/login",method=RequestMethod.POST)
	public ModelAndView login(ModelAndView mv,String id, String pw) {
		System.out.println("id");
		System.out.println("pw");
		mv.setViewName("login"); //화면 이름
		return mv;
	}
}
