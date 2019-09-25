package com.example.demo.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@WebMvcTest
public class TodoControllerTest {
	private MockMvc mockMvc;
	
    @Before
    public void setup() {

        // Spring MVCのモックを設定する
        this.mockMvc = MockMvcBuilders
        				.standaloneSetup(new TodoController())
        				.build();
    }
    
    @Test
    public void getTodoList_returns_ok() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/Todo"))
                .andExpect(status().isOk());
    }
}
