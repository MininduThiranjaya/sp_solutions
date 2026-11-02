package com.news.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.news.backend.dto.req.AddCommentReq;
import com.news.backend.model.CommentModel;
import com.news.backend.model.NewsModel;
import com.news.backend.repo.CommentRepo;
import com.news.backend.repo.NewsRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor  
public class NewsService {

    private final NewsRepo newsRepo;
    private final CommentRepo commentRepo;
    
    public List<NewsModel> getNewByCategoryService(int id) {
        List<NewsModel> news = newsRepo.findByCategoryId(id);
        return news;
    }

    public Optional<NewsModel> getNewsByIdService(int id) {
        return newsRepo.findById((long) id);
    }

    public CommentModel addCommentService(int id, AddCommentReq commentData) {
        
        Optional<NewsModel> news = newsRepo.findById((long) id);
        if (news.isPresent()) {
            NewsModel existNews = news.get();
            CommentModel comment = new CommentModel().builder()
                .name(commentData.getName())
                .content(commentData.getContent())
                .news(existNews)
                .build();
            return commentRepo.save(comment);
        }
        return null;
    }
}
