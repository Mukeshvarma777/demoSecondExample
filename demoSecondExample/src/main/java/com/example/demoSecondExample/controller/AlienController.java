package com.example.demoSecondExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demoSecondExample.Repository.AlienRepo;
import com.example.demoSecondExample.entity.Alien;

@Controller
public class AlienController {
	@Autowired
	AlienRepo ar;
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		ar.save(alien);
		return "index";
	}
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid)
	{
		
		ModelAndView mv=new ModelAndView("result");
		System.out.println(ar.findByTech("java"));
		System.out.println(ar.findByAidGreaterThan(101));
		
		Alien alien=ar.findById(aid).orElse(new Alien());
		mv.addObject(alien);
		return mv;
	}
	
}
