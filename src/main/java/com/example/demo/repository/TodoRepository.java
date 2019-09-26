package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Todo;

public interface TodoRepository {
	List<Todo> getTodoList();
	Todo addTodo();
	Todo updateTodo();
	void deleteTodo();
}
