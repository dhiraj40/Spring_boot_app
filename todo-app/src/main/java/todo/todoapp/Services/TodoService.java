package todo.todoapp.Services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import todo.todoapp.Model.TodoItem;

@Service
public class TodoService {
    
    //Intialize Todos
    List<TodoItem> todoItems = List.of(
        new TodoItem(1,11,"walk","walking",new Date(),new Date(), new Date(2022,9,27,3,4,5)),
        new TodoItem(2,11,"Sing","Singing",new Date(),new Date(), new Date(2022,9,27,3,4,5)),
        new TodoItem(3,12,"STUDY","Studying",new Date(),new Date(), new Date(2022,9,27,3,4,5)),
        new TodoItem(4,13,"Dance","dancing",new Date(),new Date(), new Date(2022,9,27,3,4,5))
    );

    public List<TodoItem> getTodoItemsByUserId(Long userId){
        List<TodoItem> items = new ArrayList<>();
        for (TodoItem todoItem : todoItems) {
            if(todoItem.getUserId() == userId) items.add(todoItem);
        }

        return items;
    }

}
