package com.ItalianZest.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ItalianZest.entity.Login;
import com.ItalianZest.entity.Menu;

import com.ItalianZest.service.LoginService;




@Controller
public class LoginController {
	 

	@Autowired 
	private LoginService loginService;

	@RequestMapping(value = "/login1", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView themodel = new ModelAndView("login1");
	    themodel.addObject("login1", new Login());

	    return themodel;
	  }

	
	
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("login1") Login login) {
	    ModelAndView themodel = null;

	   boolean valid = loginService.isValidUser(login.getUsername(),login.getPassword());

	    if (valid) {
	    themodel = new ModelAndView("welcome");
	    themodel.addObject("firstname", login.getUsername());
	    } else {
	    themodel = new ModelAndView("login");
	    themodel.addObject("message", "Username or Password is invalid!!");
	    }

	    return themodel;
	  }
	
	
	}
	
	
	 
	







