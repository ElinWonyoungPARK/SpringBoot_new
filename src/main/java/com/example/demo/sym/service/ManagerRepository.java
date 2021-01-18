package com.example.demo.sym.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.cop.bbs.service.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Article, Integer> {

    public int insert(Manager manager);

	public Manager access(Manager manager);

	public int insertMany(List<Manager> list);

}