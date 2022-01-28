package ru.skypro.lesson9;

import java.util.Objects;

public class Book {
    private final String nameBook;
    private final Author author;
    private int yearPublishing;

    public Book(String nameBook, Author author, int yearPublishing) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    @Override
    public String toString() {
        return nameBook + " " + author + " " + yearPublishing;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book a = (Book) other;
        return nameBook.equals(a.nameBook)
                && author.equals(a.author)
                && yearPublishing == a.yearPublishing;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, yearPublishing);
    }
}
