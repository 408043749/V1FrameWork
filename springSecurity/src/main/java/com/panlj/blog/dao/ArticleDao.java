package com.panlj.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panlj.blog.domain.Article;

interface IArticleDaoExt<T>{
}

public interface ArticleDao extends JpaRepository<Article,Long>,IArticleDaoExt<Article> {
}
