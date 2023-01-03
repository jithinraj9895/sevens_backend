package com.ms.seven.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ms.seven.model.Article;


public interface ArticleRepo extends MongoRepository<Article, Integer>{
	
	
}