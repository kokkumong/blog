package com.example.demo.domain.port.out;

import com.example.demo.domain.model.Article;
import java.util.Optional;

public interface ArticlePort {
    Article save(Article article);
    Optional<Article> findById(Long articleId);
}
