package com.panlj.blog.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.panlj.blog.domain.Article;

@Repository
public class ArticleDaoExt implements IArticleDaoExt<Article>{
	@PersistenceContext
	private EntityManager entityManager;
	
}
