package com.transunion.hexagonaltest.entrypoints.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transunion.hexagonaltest.models.Test;
import com.transunion.hexagonaltest.usecases.TestUseCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	public TestUseCase testUseCase;
	
	
	 @PostMapping("/add")
	 public Test addBook(@RequestBody Test test) {
	        return testUseCase.addTest(test);
	 }
	
	
}
