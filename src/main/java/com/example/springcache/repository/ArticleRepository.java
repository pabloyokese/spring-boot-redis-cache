package com.example.springcache.repository;
import com.example.springcache.entity.Article;
import org.springframework.data.repository.CrudRepository;


public interface ArticleRepository extends CrudRepository<Article, Long>  {
}
