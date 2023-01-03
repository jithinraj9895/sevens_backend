package com.ms.seven.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Game")
public class Article {
	
	@Id
	private int id;	
	private String slug;
	private String title;
	private String description;
	private String body;
	private List<String> tagList;
	
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Article(int id, String slug, String title, String description, String body, List<String> tagList) {
		super();
		this.id = id;
		this.slug = slug;
		this.title = title;
		this.description = description;
		this.body = body;
		this.tagList = tagList;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public List<String> getTagList() {
		return tagList;
	}
	public void setTagList(List<String> tageList) {
		this.tagList = tageList;
	}

}
