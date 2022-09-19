package Zadatak2;

import java.util.ArrayList;

public class Videos {
    //Svaki video ima naziv, autora,
    //    // dužinu trajanja snimka.

    private String title;
    private String length;
    private Author author;

    public Videos(){

    }

    public Videos(String title, String length, Author author) {
        this.title = title;
        this.length = length;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
