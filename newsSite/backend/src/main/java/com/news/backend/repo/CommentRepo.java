package com.news.backend.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.news.backend.model.CommentModel;

@Repository 
public interface CommentRepo extends JpaRepository<CommentModel, Long> {

}
