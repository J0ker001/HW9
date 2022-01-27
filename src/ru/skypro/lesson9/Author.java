package ru.skypro.lesson9;
import java.util.Objects;

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

    @Override
    public String toString() {
        return name + " " + famaly;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a = (Author) other;
        return famaly.equals(a.famaly)
                && name.equals(a.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
