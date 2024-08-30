package com.project.ToDo_App.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ToDo_App.Model.ToDo;


@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long>{

}