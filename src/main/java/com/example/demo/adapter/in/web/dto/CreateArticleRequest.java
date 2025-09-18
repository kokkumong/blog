package com.example.demo.adapter.in.web.dto;

import com.example.demo.domain.port.in.CreateArticleUseCase.CreateArticleCommand;
import jakarta.validation.constraints.NotBlank;

public record CreateArticleRequest(
        @NotBlank String email,
        @NotBlank String password,
        @NotBlank String title,
        @NotBlank String content
) {
    public CreateArticleCommand toCommand() {
        return new CreateArticleCommand(email, password, title, content);
    }
}
