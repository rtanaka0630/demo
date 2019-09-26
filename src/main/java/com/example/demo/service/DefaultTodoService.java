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
	public Todo addTodo() {
		return null;
	}

	@Override
	public Todo updateTodo() {
		return null;
	}

	@Override
	public void deleteTodo() {
		
	}

}
