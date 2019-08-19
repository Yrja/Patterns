package com.example.patterns.builder;

import com.example.patterns.builder.entity.Feedback;
import com.example.patterns.builder.entity.Genre;

public class FeedbackBuilder implements Builder{

    private Genre genre;
    private String title;
    private String author;
    private int pageNumber;
    private String publisherHouseName;

    @Override
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public void setPublishingHouseName(String publishingHouseName) {
        this.publisherHouseName = publishingHouseName;
    }

    public Feedback createInstance() {
        return new Feedback(genre, title, author, pageNumber, publisherHouseName);
    }
}
