package com.todoList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.todoList.model.Task;
import com.todoList.taskservicei.TaskServicei;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class TaskController {

	@Autowired
	TaskServicei tsi;
	
	@PostMapping("/postTask")
	public Task addTask(@RequestBody Task t) {
		
			Task t1 = tsi.saveTask(t);
		
		return t1;
	}
	
	@GetMapping("/getTask")
	public List<Task> getAllTask(@RequestBody List<Task> t) {
		List<Task> list = tsi.getAllTask();
		return list;
	}
	
	
}
