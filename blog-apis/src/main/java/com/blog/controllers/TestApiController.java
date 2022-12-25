package com.blog.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController {

	@RequestMapping("/names")
	public List<String> retrieveNames(){
		return Arrays.asList("A","B","C");
	}
}
