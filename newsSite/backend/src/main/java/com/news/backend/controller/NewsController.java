package com.news.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.news.backend.dto.req.AddCommentReq;
import com.news.backend.dto.res.ApiResponse;
import com.news.backend.model.CommentModel;
import com.news.backend.model.NewsModel;
import com.news.backend.service.NewsService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController 
@RequestMapping("api/news")
@RequiredArgsConstructor 
public class NewsController {

    private final NewsService newsService;
    
    @GetMapping("/get/filterByCategory/{id}")
    public ResponseEntity<ApiResponse<List<NewsModel>>> getNewByCategoryController(@PathVariable("id") int id) {
        
        List<NewsModel> news = newsService.getNewByCategoryService(id);
        ApiResponse response = ApiResponse.builder()
            .status(true)
            .message("Get news by category successfully")
            .data(news)
            .build();
        return ResponseEntity.ok(response);
}

    @GetMapping("/get/{id}")
    public ResponseEntity<ApiResponse<Optional<NewsModel>>> getNewsByIdController(@PathVariable("id") int id) {
        
        Optional<NewsModel> news = newsService.getNewsByIdService(id);
        ApiResponse response = ApiResponse.builder()
            .status(true)
            .message("Get news by id successfully")
            .data(news)
            .build();
        return ResponseEntity.ok(response);
    }

    @PostMapping("/add/comment/{id}")
    public ResponseEntity<ApiResponse<CommentModel>> addCommentController(@PathVariable("id") int id, @Valid @RequestBody AddCommentReq commentData) {
        
        CommentModel comment = newsService.addCommentService(id, commentData);
        ApiResponse response = ApiResponse.builder()
            .status(true)
            .message("Comment added successfully")
            .data(comment)
            .build();
        return ResponseEntity.ok(response);
    }
}
