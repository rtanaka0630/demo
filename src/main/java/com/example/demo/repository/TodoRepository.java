package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Todo;

public interface TodoRepository {
	List<Todo> getTodoList();
	Todo addTodo(Todo todo);
	Todo updateTodo(String key, Todo todo);
	void deleteTodo(String key);
}
