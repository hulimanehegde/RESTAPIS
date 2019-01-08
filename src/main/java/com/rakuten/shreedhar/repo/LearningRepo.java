package com.rakuten.shreedhar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rakuten.shreedhar.model.LearningModel;

@Repository
public interface LearningRepo extends JpaRepository<LearningModel, Long> {

}
