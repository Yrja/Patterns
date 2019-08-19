package com.example.patterns.builder.entity;

public class Book implements Cloneable{

    private Genre genre;
    private String title;
    private String author;
    private int pageNumber;
    private String publisherHouseName;

    public Book(Genre genre, String title, String author, int pageNumber, String publisherHouseName) {
        this.genre = genre;
        this.title = title;
        this.author = author;
        this.pageNumber = pageNumber;
        this.publisherHouseName = publisherHouseName;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getPublisherHouseName() {
        return publisherHouseName;
    }

    public void setPublisherHouseName(String publisherHouseName) {
        this.publisherHouseName = publisherHouseName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "genre=" + genre +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pageNumber=" + pageNumber +
                ", publisherHouseName='" + publisherHouseName + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
