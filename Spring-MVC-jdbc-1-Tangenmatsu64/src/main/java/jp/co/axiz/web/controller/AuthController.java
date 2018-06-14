package jp.co.axiz.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.service.LoginService;

public class AuthController {

	 @RequestMapping( "/login")
	 public String login(Model model) {
	 return "login";
	 }




	@Autowired
	private LoginService loginservice;

	@RequestMapping(value="/post",method=RequestMethod.POST)
	public String post(@ModelAttribute("login") Admin admin, Model model) {



		//List<Admin> list = loginservice.findByIdAndPassword( id,  pass);

		if (admin != null) {

			model.addAttribute("user", admin);

			return "menu.jsp";
		} else {
			model.addAttribute("errmsg", "IDまたはPASSが間違っています");
			return "login.jsp";
		}
	}
	}


