package com.najaf.harmony.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.najaf.harmony.entity.Member;
import com.najaf.harmony.service.HarmonyService;

@Controller
public class HarmonyController {

	@Autowired
	private HarmonyService harmonyService;
	
	@GetMapping("/")
	public String toIndex() {
		return "index";
	}
	
	
	@GetMapping("/sign-in")
	public String toSignIn() {
		return "sign-in";
	}
	
	@GetMapping("/sign-up")
	public String toSignUp() {
		return "sign-up";
	}
	
	@PostMapping("/save")
	public String saveInfo(@ModelAttribute Member member) {
		harmonyService.saveMember(member);
		return "redirect:/";
	}
	
	
}
