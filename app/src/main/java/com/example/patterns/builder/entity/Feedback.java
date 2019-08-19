package com.example.patterns.builder.entity;

public class Feedback {
    private Genre genre;
    private String title;
    private String author;
    private int pageNumber;
    private String publisherHouseName;

    public Feedback(Genre genre, String title, String author, int pageNumber, String publisherHouseName) {
        this.genre = genre;
        this.title = title;
        this.author = author;
        this.pageNumber = pageNumber;
        this.publisherHouseName = publisherHouseName;
    }

    public String printFeedback() {
        return "The genre is: " + genre + "\n" +
                "The title is: " + title + "\n" +
                "The author is: " + author + "\n" +
                "The page number is: " + pageNumber +
                "\n" + "The publishing house is: " + publisherHouseName;
    }
}
