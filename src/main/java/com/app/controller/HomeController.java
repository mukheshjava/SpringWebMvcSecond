package com.app.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/home")
public class HomeController {

	
	@RequestMapping("/msg")
	public ModelAndView getMsg()
	{
		return new ModelAndView("Home");
	}

	@RequestMapping("/show")
public String show()
{
return "Show";

}


}
