package com.news.backend.dto.req;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor
@Builder
public class AddCommentReq {
    
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Content is required")
    private String content;
}
