package com.example.demo.sts.service;
import java.util.List;
import java.util.Map;

import com.example.demo.cop.bbs.service.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.cmm.utl.Box;
import com.example.demo.cmm.utl.Vector;

@Repository
public interface SubjectRepository extends JpaRepository<Article, Integer>{


}