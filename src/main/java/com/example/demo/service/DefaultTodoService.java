package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Todo;
import com.example.demo.repository.DefaultTodoRepository;

@Service
public class DefaultTodoService implements TodoService {

	@Autowired
	DefaultTodoRepository todoRepository;
	
	@Override
	public List<Todo> getTodoList() {
		return todoRepository.getTodoList();
	}

	@Override
	public Todo addTodo(Todo todo) {
		return todoRepository.addTodo(todo);
	}

	@Override
	public Todo updateTodo(String key, Todo todo) {
		return todoRepository.updateTodo(key, todo);
	}

	@Override
	public void deleteTodo(String key) {
		todoRepository.deleteTodo(key);
	}

}
