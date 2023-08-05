package com.elkStackProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoApplication {

	private final List<String> todos = new ArrayList<>();
	Logger logger= LoggerFactory.getLogger(TodoApplication.class);

	@PostMapping
	public String addTodo(@RequestBody String todo) {
		todos.add(todo);
		return "Todo added successfully!";
	}

	@GetMapping
	public List<String> getTodos() {
		logger.info("Get all todos" + todos);
		return todos;
	}

	@PutMapping("/{index}")
	public String updateTodo(@PathVariable int index, @RequestBody String updatedTodo) {
		if (index >= 0 && index < todos.size()) {
			todos.set(index, updatedTodo);
			return "Todo updated successfully!";
		} else {
			return "Invalid index. Todo not updated.";
		}
	}

	@DeleteMapping("/{index}")
	public String deleteTodo(@PathVariable int index) {
		if (index >= 0 && index < todos.size()) {
			todos.remove(index);
			return "Todo deleted successfully!";
		} else {
			return "Invalid index. Todo not deleted.";
		}
	}

	@DeleteMapping
	public String clearTodos() {
		todos.clear();
		return "All todos cleared!";
	}

	@GetMapping("/{index}")
	public String getTodoByIndex(@PathVariable int index) {
		if (index >= 0 && index < todos.size()) {
			logger.info("Get todo by index" + todos.get(index));
			return todos.get(index);
		} else {
			logger.info("Invalid Index");
			return "Invalid index. Todo not found.";
		}
	}

}
