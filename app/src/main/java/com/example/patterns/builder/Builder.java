package com.example.patterns.builder;

import com.example.patterns.builder.entity.Genre;

public interface Builder {

    void setGenre(Genre genre);

    void setTitle(String title);

    void setAuthor(String author);

    void setPageNumber(int pageNumber);

    void setPublishingHouseName(String publishingHouseName);
}
