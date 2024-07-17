package com.todoList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todoList.model.Task;
@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}
