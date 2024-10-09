package com.demopractice.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.demopractice.topic.Topic;

// we are going to use embedded database Apache Derby
@Entity
public class Course {
	
	@Id
	private String id;
	private String name;
	private String descrition;
	
	@ManyToOne
	private Topic topic;//foreign key
	
	public Course() {
		super();	
	}
	
	public Course(String id, String name, String descrition, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.descrition = descrition;
		this.topic=new Topic(topicId,"","");
	}

	public String getId() {
		return id;
	}
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescrition() {
		return descrition;
	}
	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}

	

}
