package com.example.NewsExtractor.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import com.example.NewsExtractor.domain.Article;

public interface NewsExtractorService {

    public void loadContents() throws MalformedURLException, IOException;

    public List<String> listAuthors();

    public List<Article> searchArticlesByAuthor(String authorName);

    public List<Article> searchArticleByTitle(String title);

    public List<Article> searchArticleByDescription(String desc);
}
