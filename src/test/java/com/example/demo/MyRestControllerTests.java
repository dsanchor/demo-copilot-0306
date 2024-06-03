package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(MyRestController.class)
public class MyRestControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testReverseEndpoint() throws Exception {
        String inputText = "Hello";
        String expectedOutput = "olleH";

        mockMvc.perform(MockMvcRequestBuilders.get("/api/reverse")
                .param("text", inputText))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedOutput));
    }

    // test for reverse with empty text paremeter
    @Test
    public void testReverseEndpointEmptyText() throws Exception {
        String inputText = "";
        String expectedOutput = "";

        mockMvc.perform(MockMvcRequestBuilders.get("/api/reverse")
                .param("text", inputText))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedOutput));
    }

    // reverse with special characters
    @Test
    public void testReverseEndpointSpecialCharacters() throws Exception {
        String inputText = "Hello World!";
        String expectedOutput = "!dlroW olleH";

        mockMvc.perform(MockMvcRequestBuilders.get("/api/reverse")
                .param("text", inputText))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedOutput));
    }


    @Test
    public void testDisemvowelEndpoint() throws Exception {
        String inputText = "Hello World";
        String expectedOutput = "Hll Wrld";

        mockMvc.perform(MockMvcRequestBuilders.get("/api/disemvowel")
                .param("text", inputText))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedOutput));
    }

    @Test
    public void testPalindromeEndpoint() throws Exception {
        String palindromeText = "madam";
        String nonPalindromeText = "hello";

        mockMvc.perform(MockMvcRequestBuilders.get("/api/palindrome")
                .param("text", palindromeText))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Yes"));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/palindrome")
                .param("text", nonPalindromeText))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("No"));
    }
}