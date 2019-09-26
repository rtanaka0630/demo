package com.example.demo.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.entity.Todo;
import com.example.demo.service.DefaultTodoService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest
public class TodoControllerTest {
	private MockMvc mockMvc;
	
    private ObjectMapper mapper;
	
	@Mock
	private DefaultTodoService todoService;
	
	@InjectMocks
	private TodoController todoController;
	
	
    @Before
    public void setup() {
    	mapper = new ObjectMapper();
    	MockitoAnnotations.initMocks(this);
    	//todoController.todoService = spyStubTodoService;

        // Spring MVCのモックを設定する
        this.mockMvc = MockMvcBuilders
        				.standaloneSetup(todoController)
        				.build();
    }
    
    @Test
    public void getTodoList_returns_ok() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/Todo"))
                .andExpect(status().isOk());
    }
    
    @Test
    public void getTodoList_returns_TodoList() throws Exception {
    	Todo expected = new Todo();
    	expected.setTitle("Test");
    	expected.setText("Test text");
    	expected.setLimit("2019/10/31");
    	List<Todo> list = new ArrayList<>(Arrays.asList(expected));
    	
    	when(todoService.getTodoList()).thenReturn(list);
    	mockMvc.perform(MockMvcRequestBuilders.get("/Todo"))
    			.andExpect(content().json(mapper.writeValueAsString(list)));
    }
    
    @Test
    public void addTodo_returns_ok() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/Todo"))
        .andExpect(status().isOk());
    }
    
    @Test
    public void addTodo_returns_Todo() throws Exception {
    	Todo expected = new Todo();
    	expected.setTitle("Test");
    	expected.setText("Test text");
    	expected.setLimit("2019/10/31");
    	
    	when(todoService.addTodo()).thenReturn(expected);
    	mockMvc.perform(MockMvcRequestBuilders.post("/Todo"))
    			.andExpect(content().json(mapper.writeValueAsString(expected)));
    }
    
    @Test
    public void updateTodo_returns_ok() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.put("/Todo"))
        .andExpect(status().isOk());
    }
    
    @Test
    public void updateTodo_returns_Todo() throws Exception {
    	Todo expected = new Todo();
    	expected.setTitle("Test");
    	expected.setText("Test text");
    	expected.setLimit("2019/10/31");
    	
    	when(todoService.updateTodo()).thenReturn(expected);
    	mockMvc.perform(MockMvcRequestBuilders.put("/Todo"))
    			.andExpect(content().json(mapper.writeValueAsString(expected)));
    }
    
    @Test
    public void deleteTodo_returns_ok() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/Todo"))
        .andExpect(status().isOk());
    }

}
