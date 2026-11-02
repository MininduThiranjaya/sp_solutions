package com.news.backend.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.news.backend.model.NewsModel;

@Repository 
public interface NewsRepo extends JpaRepository<NewsModel, Long> {
    
    @Query(value = "select * from news n join news_categories c on n.id = c.news_id where c.category_id = :categoryId", nativeQuery = true)
    List<NewsModel> findByCategoryId(int categoryId);
}
