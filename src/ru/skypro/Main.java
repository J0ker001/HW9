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


        Book book = new Book("Мцыри", new Author(name, famaly), yearPublishing);
        System.out.println(book);

        book.setYearPublishing(1999);
        System.out.println("book.getYearPublishing() = " + book.getYearPublishing());


        Book book1 = new Book("Евгений Онегин", new Author(namePush, famalyPush), yearPublishingPush);

        book.setYearPublishing(2022);
        System.out.println("book.getYearPublishing() = " + book.getYearPublishing());


        String nameBook1 = "Мцыри";
        String name1 = "Михаил";
        String famaly1 = "Лермонтов";
        int yearPublishing1 = 1965;
        Book book3 = new Book("Мцыри", new Author(name1, famaly1), yearPublishing1);
        System.out.println(book3.equals(book));
        Author a = new Author(name, famaly);
        Author b = new Author(name1, famaly1);
        System.out.println(a.equals(b));


    }
}
