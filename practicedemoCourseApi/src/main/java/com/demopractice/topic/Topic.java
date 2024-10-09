package com.demopractice.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

// we are going to use embedded database Apache Derby
@Entity
public class Topic {
	
	@Id
	private String id;
	private String name;
	private String descrition;
	
	
	public Topic() {
		super();	
	}
	
	public Topic(String id, String name, String descrition) {
		super();
		this.id = id;
		this.name = name;
		this.descrition = descrition;
	}

	public String getId() {
		return id;
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
