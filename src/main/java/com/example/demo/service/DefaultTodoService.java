package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Todo;

@Service
public class DefaultTodoService implements TodoService {

	@Override
	public List<Todo> getTodoList() {
		return new ArrayList<>(Arrays.asList(new Todo()));
	}

}
