package jp.co.axiz.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {

	 @RequestMapping("/login")
	 public String login(Model model) {
	 return "login";
	 }




	//@Autowired
	//private LoginService loginservice;

	//@RequestMapping(value="/login",method=RequestMethod.POST)
	//public String post(@ModelAttribute("login") Admin admin, Model model) {
		//return "login";





		//List<Admin> list = loginservice.findByIdAndPassword( id,  pass);

		//if (admin != null) {

			//model.addAttribute("user", admin);

			//return "menu.jsp";
		//} else {
			//model.addAttribute("errmsg", "IDまたはPASSが間違っています");
			// System.out.println("login");
			//return "login.jsp";

		//}
	}
	//}


