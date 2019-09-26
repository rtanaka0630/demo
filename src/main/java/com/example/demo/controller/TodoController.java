package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public Todo addTodo(@RequestBody Todo todo) {
		return todoService.addTodo(todo);
	}
	
	@PutMapping(value = "{key}")
	public Todo updateTodo(@PathVariable("key") String key, @RequestBody Todo todo) {
		return todoService.updateTodo(key, todo);
	}
	
	@DeleteMapping(value = "{key}")
	public void deleteTodo(@PathVariable("key") String key) {
		todoService.deleteTodo(key);
	}
	
}
