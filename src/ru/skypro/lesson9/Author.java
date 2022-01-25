package ru.skypro.lesson9;

public class Author {
    private final String name;
    private final String famaly;

    public Author(String name, String famaly) {
        this.name = name;
        this.famaly = famaly;
    }

    public String getName() {
        return name;
    }

    public String getFamaly() {
        return famaly;
    }
}
