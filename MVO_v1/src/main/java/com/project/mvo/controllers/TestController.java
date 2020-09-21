package com.project.mvo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.mvo.models.Test;
import com.project.mvo.services.TestService;

@RestController
@RequestMapping({ "/" })
public class TestController {

	@Autowired
	TestService testService;

	@GetMapping("/")
	public List<Test> listar() {
		return testService.listAllUser();
	}
	
}
