package com.jwt.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.sample.entity.AuthRequest;
import com.jwt.sample.entity.Users;
import com.jwt.sample.repository.UserRepository;
import com.jwt.sample.util.JwtUtil;

@Controller
public class WelcomeController {

	@Autowired
	private UserRepository userRepo;

	
	  @Autowired 
	  private JwtUtil jwtUtil;
	  
	  @Autowired 
	  private AuthenticationManager authenticationManager;
	// Welcome page return a link for Sign Up and Sign In 
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	// Sign Up
	@GetMapping("/register")
	public String signUpPage(Model model) {
		model.addAttribute("userForm", new Users());
		return "signup_form";
	}
	
	//Save the signed up details in Database 
	@PostMapping("/process_register")
	public String register(Users users) {
		
		userRepo.save(users);
		return "welcome";
	}
	//Getting information for User
	@GetMapping("/register")
	public String loginPage(Model model) {
		model.addAttribute("loginForm", new Users());
		return "login";
	}
	//Page for Sign In
	  @PostMapping("/login")
	  public String generateToken(@RequestBody Users users) throws Exception {
		  System.out.print("request coming"); 
		  try { 
			  authenticationManager.authenticate( new UsernamePasswordAuthenticationToken(users.getEmail(),users.getPassword()) ); 
			  } 
		  catch (Exception ex) { 
			  throw new  Exception("inavalid username/password");
			  }
		  return   jwtUtil.generateToken(users.getEmail()); 
		  }
	 
	
}
