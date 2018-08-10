package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView welcome()
	{
		String msg="<h1>hello from spring mvc</h1>";
		ModelAndView mv=new ModelAndView();
		mv.setViewName("welcome");
		mv.addObject("msg",msg);
		return mv;
	}
}
