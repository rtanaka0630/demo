package com.example.demo.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.entity.Todo;
import com.example.demo.repository.DefaultTodoRepository;

public class DefaultTodoServiceTest {
	
	@Mock
	DefaultTodoRepository todoRepository;
	
	@InjectMocks
	DefaultTodoService todoService;
	
	@Before
	public void setUp() {
    	MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getTodoList_returns_TodoList() {
    	Todo expected = new Todo();
    	expected.setTitle("Test");
    	expected.setText("Test text");
    	expected.setLimit("2019/10/31");
    	List<Todo> list = new ArrayList<>(Arrays.asList(expected));
    	
		when(todoRepository.getTodoList()).thenReturn(list);
		assertThat(todoService.getTodoList(), is(new ArrayList<>(Arrays.asList(expected))));
	}
	

}
