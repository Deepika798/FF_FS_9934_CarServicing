package com.hcl.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.springmvc.model.ServicesProvided;
import com.hcl.springmvc.service.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class ServicesProvidedController {
	@Autowired
	public UserServiceImpl userService;

	@RequestMapping(value = "/servicesprovided", method = RequestMethod.POST)
	public ModelAndView add(@Valid ServicesProvided servicesprovided, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("servicesprovided");
		} else {
			if (userService.servicesprovided(servicesprovided))
				return new ModelAndView("success");
			else
				return new ModelAndView("success");
		}
	}

	@RequestMapping("/servicesprovided")
	public ModelAndView add() {
		// return new ModelAndView("redirect:user/registration");
		return new ModelAndView("servicesprovided", "servicesprovided", new ServicesProvided());

	}
}