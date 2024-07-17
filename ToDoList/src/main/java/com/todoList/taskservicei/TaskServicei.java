package com.todoList.taskservicei;

import java.util.List;

import com.todoList.model.Task;

public interface TaskServicei {

	public Task saveTask(Task t);

	public List<Task> getAllTask();

	
}
