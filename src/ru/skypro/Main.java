package ru.skypro;

import ru.skypro.lesson9.Author;
import ru.skypro.lesson9.Book;

public class Main {

    public static void main(String[] args) {

        String nameBook = "Мцыри";
        String name = "Михаил";
        String famaly = "Лермонтов";
        int yearPublishing = 1965;


        String nameBookPush = "Евгений Онегин";
        String namePush = "Александр";
        String famalyPush = "Пушкин";
        int yearPublishingPush = 1933;

        Author author = new Author(name, famaly);
        Book book = new Book(nameBook, author.getName() + " " + author.getFamaly(), yearPublishing);

        book.setYearPublishing(1999);
        System.out.println("book.getYearPublishing() = " + book.getYearPublishing());


        Author author1 = new Author(namePush, famalyPush);
        Book book1 = new Book(nameBookPush, author.getName(), yearPublishingPush);

        book.setYearPublishing(2022);
        System.out.println("book.getYearPublishing() = " + book.getYearPublishing());


    }
}
