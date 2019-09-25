package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Todo;

@RestController("/Todo")
public class TodoController {

	@GetMapping
	public void getTodoList() {
		
	}
	
}
