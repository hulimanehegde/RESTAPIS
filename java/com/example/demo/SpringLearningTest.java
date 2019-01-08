package com.rakuten.shreedhar.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rakuten.shreedhar.model.LearningModel;
import com.rakuten.shreedhar.repo.LearningRepo;


@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootConfiguration

public class SpringLearningTest {

	LearningModel learningModel;
	@Mock
	LearningRepo learningRepository;
	
	@Test
	public void test() {
		
		List<LearningModel> learningList = learningRepository.findAll();
		if(learningModel.getSubject() == java) {
			assertTrue(true);
		}
		
		
		
	}

}
