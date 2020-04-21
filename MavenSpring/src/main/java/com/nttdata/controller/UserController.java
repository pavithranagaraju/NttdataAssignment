package com.nttdata.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nttdata.model.User;
import com.nttdata.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String registerPage(Model model){
		model.addAttribute("user", new User());
		return "register";
	}
	
	@RequestMapping(value="/registerSuccess",method=RequestMethod.POST)
	public String registerSuccess(@Valid @ModelAttribute("user") User user,BindingResult result) {
		
		if(result.hasErrors()){
			return "register";
		}
		userService.createUser(user);
		return "redirect:/welcome";
	}
	
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public ModelAndView registerSuccess(ModelAndView modelAndView ){
		modelAndView.setViewName("welcome");
		List<User> userList = userService.getUserList();
		modelAndView.addObject("userList",userList);
		return modelAndView;
	}
	
}
