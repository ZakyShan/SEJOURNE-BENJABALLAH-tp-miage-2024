package com.acme.todolist.adapters.rest_api;

import java.util.List;

import javax.inject.Inject;

import com.acme.todolist.adapters.persistence.TodoItemRepository;
import com.acme.todolist.application.port.in.AddTodoItem;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.acme.todolist.application.port.in.GetTodoItems;
import com.acme.todolist.domain.TodoItem;

/**
 * Le controlleur Spring MVC qui expose les endpoints REST
 * 
 * @author bflorat
 *
 */
@RestController
public class TodoListController {
	
	
	private final GetTodoItems getTodoItemsQuery;
	private AddTodoItem addTodoItemQuery;

	
	@Inject
	public TodoListController(GetTodoItems getTodoItemsQuery ) {
		this.getTodoItemsQuery = getTodoItemsQuery;
	}
	
	@GetMapping("/todos")
	public List<TodoItem> getAllTodoItems() {
		return this.getTodoItemsQuery.getAllTodoItems();
	}

	@PostMapping("/todos")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void ajouterItem(@RequestBody TodoItem todoItem) {
		this.addTodoItemQuery.addTodoItem(todoItem);
	}
	
	
}
