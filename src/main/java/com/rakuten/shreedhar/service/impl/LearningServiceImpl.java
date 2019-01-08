package com.rakuten.shreedhar.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.rakuten.shreedhar.dto.LearningDto;
import com.rakuten.shreedhar.model.LearningModel;
import com.rakuten.shreedhar.repo.LearningRepo;
import com.rakuten.shreedhar.service.LearningService;

@Service
public class LearningServiceImpl implements LearningService {

	@Autowired
	private LearningRepo learningRepo;
	
	@Override
	public List<LearningDto> getAllLearnings() {
		
		List<LearningDto> learningDtoList = new ArrayList<LearningDto>(10);
		
		LearningDto learningDto = null;
		
		List<LearningModel> learningModelList = null;
		
		learningModelList = learningRepo.findAll();
		
		for (LearningModel learningModel : learningModelList) {
			learningDto = new LearningDto(learningModel);
			learningDtoList.add(learningDto);
		}
		
		return learningDtoList;
	}
@Override
	public LearningDto saveLearnings(String subject) {
		
		LearningDto learningDto = null;
		
		if (StringUtils.isEmpty(subject)) {
			return learningDto;
		}
		
		LearningModel learningModel = new LearningModel();
		learningModel.setSubject(subject);
		
		LearningModel savedLearningModel = learningRepo.save(learningModel);
		
		learningDto = new LearningDto(savedLearningModel);
		
		return learningDto;
	}

}
