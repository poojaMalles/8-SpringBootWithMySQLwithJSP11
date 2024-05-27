package com.excelr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.excelr.entity.Students;
import com.excelr.repo.ExcelRRepo;

@Controller
public class ExcelRController {
	
	@Autowired
	private ExcelRRepo repo;
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent() {
		return "addStudent";
	}
	
	@RequestMapping("/success")
	public String success(Students student) {
		repo.save(student);
		return "success";
	}
	
	@RequestMapping("/viewStudents")
	public String viewStudents(ModelMap model) {
		model.put("students", repo.findAll());
		return "viewStudents";
	}
	@RequestMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
		repo.deleteById(id);
		return "redirect:/viewStudents";
	}
	
	@RequestMapping("/edit/{id}")
	public String editById(@PathVariable int id,ModelMap model) {
		model.put("student", repo.findById(id));
		return "editById";
	}
	@RequestMapping("/updateandsave")
	public String updateandsave(Students student) {
		repo.save(student);
		return "redirect:/viewStudents";
		
	}
}
