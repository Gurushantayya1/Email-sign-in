package com.example.demo;

import org.springframework.stereotype.Controller;
//localhost:9091
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class EmailController {

	@RequestMapping("login")
	String loginUser() {
		return "login.jsp";
	}
	
	@RequestMapping("validate")
	String validateUser(String email,String password) {
		if(email.equals("admin@gmail.com")&&password.equals("Admin@123")) {
			return "welcome.jsp";
		}
	return "error.jsp";
}
}