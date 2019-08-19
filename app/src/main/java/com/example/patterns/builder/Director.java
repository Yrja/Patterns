package com.example.patterns.builder;

import com.example.patterns.builder.entity.Genre;

public class Director {

    public void createFantasyBook(Builder builder) {

        builder.setGenre(Genre.FANTASY);
        builder.setAuthor("Joan Rowling");
        builder.setPageNumber(269);
        builder.setPublishingHouseName("AMAZON");
        builder.setTitle("Harry Potter");
    }

    public void createDetectiveBook(Builder builder) {

        builder.setGenre(Genre.DETECTIVE);
        builder.setAuthor("Arthur Conan Doyle");
        builder.setPageNumber(589);
        builder.setPublishingHouseName("AMAZON");
        builder.setTitle("Sherlock Holmes");
    }
}
