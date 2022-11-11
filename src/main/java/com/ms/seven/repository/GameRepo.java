package com.ms.seven.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ms.seven.model.Game;

public interface GameRepo extends MongoRepository<Game, Integer>{
	
	
}
