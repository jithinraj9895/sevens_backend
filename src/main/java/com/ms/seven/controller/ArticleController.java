package com.ms.seven.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.seven.model.Article;
import com.ms.seven.repository.ArticleRepo;

@RestController
@CrossOrigin(origins = "https://sevenswebapp-production.up.railway.app")
public class ArticleController {
	
	@Autowired
	ArticleRepo repo;
	
	@PostMapping("/addArticle")
	public String saveGame(@RequestBody Article article) {
		repo.save(article);
		return "Added success";
	}
	
	@GetMapping("/articles")
	public List<Article> getArticles(){
		return repo.findAll();
	}
	
	@GetMapping("/tags")
	public HashMap<String,List<String>> getTagd(){
		List<Article> list =  repo.findAll();
		Article str = list.get(list.size()-1);
		System.out.println(str.getTagList());
		HashMap<String,List<String>> li = new HashMap<>();
		li.put("tags",str.getTagList());
		return li;
	}
}
