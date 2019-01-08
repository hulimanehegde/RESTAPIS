package com.rakuten.shreedhar.dto;

import com.rakuten.shreedhar.model.LearningModel;

public class LearningDto {

	private Long id;
	
	private String subject;
	
	public LearningDto() { }

	public LearningDto(Long id, String subject) {
		super();
		this.id = id;
		this.subject = subject;
	}
	
	public LearningDto(LearningModel learningModel) {
		super();
		this.id = learningModel.getId();
		this.subject = learningModel.getSubject();
		
	}

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
}
