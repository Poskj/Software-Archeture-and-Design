package com.solid.book;


import java.util.List;

public class BookPublisher {
    public static void main(String[] args) {
        publish book = new publishBook("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToFile();
    }
}
