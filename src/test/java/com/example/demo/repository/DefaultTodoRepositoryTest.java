package com.example.demo.repository;

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

public class DefaultTodoRepositoryTest {
	
	private DefaultTodoRepository todoRepository;
	
	@Before
	public void setUp() {
		todoRepository = new DefaultTodoRepository();
	}

}
