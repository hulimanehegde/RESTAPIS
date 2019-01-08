package com.rakuten.shreedhar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.shreedhar.dto.LearningDto;
import com.rakuten.shreedhar.service.LearningService;

@RestController
public class LearningController {

	@Autowired
	private LearningService learningService;
	
	@GetMapping
	public List<LearningDto> getAllLearnings() {
		return learningService.getAllLearnings();
	}
	
	@PostMapping
	public LearningDto saveLearning(@RequestBody String subject) {
		return learningService.saveLearnings(subject);
	}
}
