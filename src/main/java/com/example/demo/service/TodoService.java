package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Todo;

public interface TodoService {
	public List<Todo> getTodoList();
	public Todo addTodo();
	public Todo updateTodo();
	public void deleteTodo();
}
