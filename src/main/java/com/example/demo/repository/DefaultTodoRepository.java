package com.example.demo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.entity.Todo;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultTodoRepository implements TodoRepository {
	
	private Map<String, Todo> todoList = new HashMap<>();

	DefaultTodoRepository() {
		Todo sample = new Todo();
		sample.setTitle("Sample");
		sample.setText("Sample Text");
		sample.setLimit("20190331");
		todoList.put(sample.getTitle(), sample);
	}
	
	@Override
	public List<Todo> getTodoList() {
		return new ArrayList<Todo>(todoList.values());
	}
	
}
