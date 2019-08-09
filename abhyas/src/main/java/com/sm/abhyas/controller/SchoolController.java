package com.sm.abhyas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sm.abhyas.service.SchoolService;

@RestController("/api/schools")
public class SchoolController {
	
	@Autowired
	private SchoolService schoolService;

	@RequestMapping(path = {"/"}, method=RequestMethod.GET)
	public @ResponseBody String findSchools() {
		return schoolService.findSchools().toString();
	}

}
