package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Todo;

public interface TodoService {
	public List<Todo> getTodoList();
	public Todo addTodo(Todo todo);
	public Todo updateTodo(String key, Todo todo);
	public void deleteTodo(String key);
}
