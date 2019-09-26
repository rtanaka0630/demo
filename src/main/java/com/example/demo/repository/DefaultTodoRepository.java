package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Todo;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultTodoRepository implements TodoRepository {

	@Override
	public List<Todo> getTodoList() {
		return null;
	}
	
}
