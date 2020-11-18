package com.hcl.springmvc.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.springmvc.model.BillDetails;
import com.hcl.springmvc.model.ServiceCenter;
import com.hcl.springmvc.service.UserServiceImpl;


/**
 * 
 * 
 * @author lingad2
 *
 */
@Controller
@RequestMapping("/user")
public class BillDetailsController {
	@Autowired
	public UserServiceImpl userService;

	@RequestMapping(value = "/billdetails", method = RequestMethod.POST)
	public ModelAndView add(@Valid BillDetails billdetails, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("billdetails");
		} else {
			if (userService.billdetails(billdetails))
				return new ModelAndView("success");
			else
				return new ModelAndView("success");
		}
	}

	@RequestMapping("/billdetails")
	public ModelAndView add() {
		// return new ModelAndView("redirect:user/registration");
		return new ModelAndView("billdetails", "billdetails", new BillDetails());

	}
}
