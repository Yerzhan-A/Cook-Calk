package com.example.calorie;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.hamcrest.Matchers.*;

@WebMvcTest(CalorieController.class)
public class CalorieControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testHomePage() throws Exception{
        mockMvc.perform(get("/")).
                andExpect(status().isOk()).
                andExpect(view().name("home")).
                andExpect(content().string(containsString("Welcome to...")));
    }
}
