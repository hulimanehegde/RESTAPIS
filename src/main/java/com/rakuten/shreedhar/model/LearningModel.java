package com.rakuten.shreedhar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.rakuten.shreedhar.dto.LearningDto;

@Entity
public class LearningModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String subject;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public LearningModel() { }

	public LearningModel(Long id, String subject) {
		super();
		this.id = id;
		this.subject = subject;
	}
	
	public LearningModel(LearningDto learningDto) {
		super();
		this.id = learningDto.getId();
		this.subject = learningDto.getSubject();
	}
}
