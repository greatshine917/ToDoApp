package com.codestates.TodoApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {
    @GetMapping("/")
    public String toDo() {
        return "To-Do Application !";
    } // dd
}
