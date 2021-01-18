package com.example.demo.sym.service;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import com.example.demo.cop.bbs.service.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.cmm.utl.Box;
import com.example.demo.sts.service.Grade;
import com.example.demo.sts.service.GradeVo;

@Repository
public interface TeacherRepository extends JpaRepository<Article, Integer> {
	public int insertMany(List<Teacher>list);
	public Teacher access(Teacher teacher);
	public int insert(Teacher teacher);
	public Vector<GradeVo> selectAll(Map<?,?> map);
}