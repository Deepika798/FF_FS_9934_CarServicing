package com.hcl.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.springmvc.model.DeliveryBoy;
import com.hcl.springmvc.service.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class DeliveryBoyController {
	@Autowired
	public UserServiceImpl userService;

	@RequestMapping(value = "/deliveryboy", method = RequestMethod.POST)
	public ModelAndView add(@Valid DeliveryBoy deliveryboy, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("deliveryboy");
		} else {
			if (userService.deliveryboy(deliveryboy))
				return new ModelAndView("deliveryboy");
			else
				return new ModelAndView("loginFailed");
		}
	}

	@RequestMapping("/deliveryboy")
	public ModelAndView add() {
		// return new ModelAndView("redirect:user/registration");
		return new ModelAndView("deliveryboy", "deliveryboy", new DeliveryBoy());

	}
}