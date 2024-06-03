package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/api/reverse")
    public String reverse(@RequestParam String text) {
        System.out.println("Input: " + text);
        String reversedText = new StringBuilder(text).reverse().toString();
        System.out.println("Output: " + reversedText);
        return reversedText;
    }

    @GetMapping("/api/disemvowel")
    public String disemvowel(@RequestParam String text) {
        System.out.println("Input: " + text);
        String disemvoweledText = text.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Output: " + disemvoweledText);
        return disemvoweledText;
    }

    // operation to check if a word is a palindrome
    @GetMapping("/api/palindrome")
    public String palindrome(@RequestParam String text) {
        System.out.println("Input: " + text);
        String reversedText = new StringBuilder(text).reverse().toString();
        String palindrome = "No";
        if (text.equals(reversedText)) {
            palindrome = "Yes";
        }
        System.out.println("Output: " + palindrome);
        return palindrome;
    }
}
