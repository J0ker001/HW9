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


        Book book = new Book(nameBook, new Author(name, famaly), yearPublishing);

        book.setYearPublishing(1999);
        System.out.println("book.getYearPublishing() = " + book.getYearPublishing());


        Book book1 = new Book(nameBookPush, new Author(namePush, famalyPush), yearPublishingPush);

        book.setYearPublishing(2022);
        System.out.println("book.getYearPublishing() = " + book.getYearPublishing());


    }
}
