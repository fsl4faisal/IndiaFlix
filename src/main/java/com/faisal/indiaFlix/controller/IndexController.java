package com.faisal.indiaFlix.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	
	@RequestMapping("/")
	public String indexPage(Map<String,Object> map){
		
		return "index";
	}
}
