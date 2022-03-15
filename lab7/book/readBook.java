package com.solid.book;
import java.util.List;

public class readBook extends AbstractBook implements read{
    public readBook(String title, List<String> pages) {
        super(title, pages);
    }

    @Override
    public void printToScreen() {
        readBook book = this;
        do {
            System.out.println(book.getCurrentPage());
        }while (book.turnToNextPage());
    }
}
