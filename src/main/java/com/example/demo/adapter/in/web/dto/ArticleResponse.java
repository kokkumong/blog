package com.example.demo.adapter.in.web.dto;

import com.example.demo.domain.model.Article;
import com.example.demo.domain.model.Member;

public record ArticleResponse(
        Long articleId,
        String email,
        String title,
        String content
) {
    public static ArticleResponse from(Article article, Member member) {
        return new ArticleResponse(
                article.getId(),
                member.getEmail(),
                article.getTitle(),
                article.getContent()
        );
    }
}