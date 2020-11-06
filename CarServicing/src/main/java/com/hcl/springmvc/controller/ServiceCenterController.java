package com.hcl.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.springmvc.model.ServiceCenter;
import com.hcl.springmvc.service.UserServiceImpl;

/**
 * @author lingad2
 *
 */
@Controller
@RequestMapping("/user")
public class ServiceCenterController {
	@Autowired
	public UserServiceImpl userService;

	@RequestMapping(value = "/servicecenter", method = RequestMethod.POST)
	public ModelAndView add(@Valid ServiceCenter servicecenter, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("servicecenter");
		} else {
			if (userService.servicecenter(servicecenter))
				return new ModelAndView("servicesprovided");
			else
				return new ModelAndView("loginFailed");
		}
	}

	@RequestMapping("/servicecenter")
	public ModelAndView add() {
		// return new ModelAndView("redirect:user/registration");
		return new ModelAndView("servicecenter", "servicecenter", new ServiceCenter());

	}
}









/*@Controller
@RequestMapping("/user")
public class ServiceCenterController {
	@RequestMapping(value="/servicecenter")
	public String displayservicecenterForm(Model model) {
		ServiceCenter sc= new ServiceCenter();
		model.addAttribute("servicecenter", sc);
		return "servicecenter";
	}
}
	
	
	

	/*@RequestMapping("/user")*/
//System.out.println("Please work!!!");
		//return new ModelAndView("redirect:user/servicecenter");
      /*public ModelAndView servicecenter() {
	   System.out.println("servicecenter");	
          return new ModelAndView("servicecenter");
          */
