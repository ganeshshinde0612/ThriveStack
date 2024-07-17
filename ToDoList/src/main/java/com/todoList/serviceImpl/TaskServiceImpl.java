package com.todoList.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoList.TaskRepository;
import com.todoList.model.Task;
import com.todoList.taskservicei.TaskServicei;
@Service
public class TaskServiceImpl implements TaskServicei{

	@Autowired
	TaskRepository tr;

	@Override
	public Task saveTask(Task t) {
		
		return tr.save(t);
		
	}

	@Override
	public List<Task> getAllTask() {
		List<Task> list =  tr.findAll();
		return list;
	}
}
