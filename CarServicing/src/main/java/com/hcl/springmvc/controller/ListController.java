/**
 * 
 */
package com.hcl.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.springmvc.model.Login;

/**
 * @author lingad2
 *
 */
@Controller
@RequestMapping("/user")
public class ListController {
	@Autowired

	@RequestMapping("/list")
	public ModelAndView add() {

		// return new ModelAndView("redirect:user/login");
		return new ModelAndView("list", "list", new Login());
	}
}
