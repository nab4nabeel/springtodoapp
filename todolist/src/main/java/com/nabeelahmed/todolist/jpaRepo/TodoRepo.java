package com.nabeelahmed.todolist.jpaRepo;

import com.nabeelahmed.todolist.dataModel.TodoData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoData, Long> {
}
