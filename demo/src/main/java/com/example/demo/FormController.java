package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
	
	@GetMapping("/form")
	public String fristForm(Model model) {
		model.addAttribute("form", new Form());
		return "form";
	}
	
	@PostMapping("/form")
	public String fristSubmit(@ModelAttribute Form form, Model model) {
		model.addAttribute("form", form);
		return "messege2";
	}
	
}
