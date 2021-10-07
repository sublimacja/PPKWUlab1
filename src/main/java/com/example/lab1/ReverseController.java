package com.example.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ppkwu")
public class ReverseController {
    @GetMapping("/lab1/reverse/{string}")
    public String reverseString(@PathVariable("string") String string) {
        return string;
    }
}
