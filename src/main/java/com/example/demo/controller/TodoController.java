package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Todo;
import com.example.demo.service.TodoService;

@RestController("/Todo")
public class TodoController {
	
	@Autowired
	TodoService todoService;

	@GetMapping
	public List<Todo> getTodoList() {
		return todoService.getTodoList();
	}
	
	@PostMapping
	public Todo addTodo() {
		return todoService.addTodo();
	}
	
	@PutMapping
	public Todo updateTodo() {
		return todoService.updateTodo();
	}
	
	@DeleteMapping
	public void deleteTodo() {
		todoService.deleteTodo();
	}
	
}
