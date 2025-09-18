package com.example.demo.domain.port.in;

import com.example.demo.domain.model.Article;

public interface CreateArticleUseCase {

    Article createArticle(CreateArticleCommand command);

    record CreateArticleCommand(
            String email,
            String password,
            String title,
            String content
    ) {}
}
