package com.example.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class UserController {

	@GetMapping("/")
	public ModelAndView test() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("test.html");
		modelAndView.setStatus(HttpStatus.I_AM_A_TEAPOT);
		return modelAndView;
	}
}
