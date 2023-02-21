package kr.kh.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.kh.test.service.MemberService;
import kr.kh.test.vo.MemberVO;

@Controller
public class HomeController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView mv, Integer num) {
		String name = memberService.selectMemberName(num);
		mv.setViewName("/main/home");
		return mv;
	}
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView signup(ModelAndView mv) {
		mv.setViewName("/member/signup");
		return mv;
	}
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public ModelAndView signupPost(ModelAndView mv, MemberVO member) {	
		boolean res = memberService.signup(member);
		if(res) {
			//성공했다고 알림 메세지(추후 구현 예정)
			mv.setViewName("redirect:/");
		}else {
			//실패했다고 알림 메세지(추후 구현 예정)
			mv.setViewName("redirect:/signup");
		}
		
		return mv;
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(ModelAndView mv) {
		mv.setViewName("/member/login");
		return mv;
	}
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public ModelAndView loginPost(ModelAndView mv, MemberVO member) {
//		System.out.println("member");
//		mv.setViewName("/member/login");
//		return mv;
//	}
	//확인되면 위에꺼 지우고 
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPost(ModelAndView mv, MemberVO member) {
		MemberVO
		mv.setViewName("/member/login");
		return mv;
	}
}


















