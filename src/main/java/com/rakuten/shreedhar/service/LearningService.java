package com.rakuten.shreedhar.service;

import java.util.List;

import com.rakuten.shreedhar.dto.LearningDto;

public interface LearningService {

	List<LearningDto> getAllLearnings();

	LearningDto saveLearnings(String subject);

}
