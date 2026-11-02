package com.news.backend.dto.res;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NotBlank
@NoArgsConstructor 
@AllArgsConstructor
@Builder
public class ApiResponse<T> {
    
    private boolean status;
    private String message;
    private T data;
}
