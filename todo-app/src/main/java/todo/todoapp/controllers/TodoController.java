package todo.todoapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import todo.todoapp.Model.TodoItem;
import todo.todoapp.Services.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {
    
    @Autowired
    TodoService todoService;

    @GetMapping("/{userId}")
    List<TodoItem> getTodoItems(@PathVariable Long userId)
    {
        return todoService.getTodoItemsByUserId(userId);
    }

}
