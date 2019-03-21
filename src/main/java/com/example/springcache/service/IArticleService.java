package com.example.springcache.service;

import com.example.springcache.entity.Article;

import java.util.List;

public interface IArticleService {
    List<Article> getAllArticles();
    Article getArticleById(long articleId);
    Article addArticle(Article article);
    Article updateArticle(Article article);
    void deleteArticle(long articleId);
}