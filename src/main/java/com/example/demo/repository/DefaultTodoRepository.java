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

	@Override
	public Todo addTodo(Todo todo) {
		todoList.put(todo.getTitle(), todo);
		return todoList.get(todo.getTitle());
	}

	@Override
	public Todo updateTodo(String key, Todo todo) {
		if(todoList.containsKey(key)) {
			todoList.put(key, todo);
			return todoList.get(key);
		} else {
			// TODO
			return null;
		}
	}

	@Override
	public void deleteTodo(String key) {
		if(todoList.containsKey(key)) {
			todoList.remove(key);
		} else {
			// TODO
		}
	}
	
}
