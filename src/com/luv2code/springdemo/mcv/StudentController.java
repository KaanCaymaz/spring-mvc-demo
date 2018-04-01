package com.luv2code.springdemo.mcv;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Value("#{languages}") 
	private Map<String,String> languages;
	
	
	@RequestMapping("/showForm")
	public String showForm( Model theModel) {
		
		Student student = new Student();
		
		theModel.addAttribute("student", student);
		
		theModel.addAttribute("languages",languages);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		System.out.println("Student: " + theStudent.getFirstName() + " " + theStudent.getLastName());
		
		return "student-confirmation";
	}
	
}
