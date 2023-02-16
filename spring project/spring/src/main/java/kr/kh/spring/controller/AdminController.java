package kr.kh.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

	@RequestMapping(value="/admin/board/type/list")
	public ModelAndView boardTypeList(ModelAndView mv) {
		
		mv.addObject("list","게시글 타입 리스트");
		mv.setViewName("/admin/boardTypeList");
		return mv;
	}
}
