package com.example.demo.adapter.out.persistence;

import com.example.demo.domain.model.Article;
import org.springframework.stereotype.Component;

@Component
public class ArticleMapper {
    public Article toDomain(ArticlePersistenceEntity entity) {
        return Article.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .content(entity.getContent())
                .authorId(entity.getAuthor().getId())
                .build();
    }
    public ArticlePersistenceEntity toEntity(Article domain, MemberPersistenceEntity author) {
        return ArticlePersistenceEntity.builder()
                .id(domain.getId())
                .title(domain.getTitle())
                .content(domain.getContent())
                .author(author)
                .build();
    }
}