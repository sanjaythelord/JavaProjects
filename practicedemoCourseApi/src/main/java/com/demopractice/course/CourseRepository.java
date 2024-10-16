package com.demopractice.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{

	//public List<Course> findByName(String name);
	//public List<Course> findByDescrition(String descrition);
	public List<Course> findByTopicId(String topicId);
}
