package CH13;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("자바", 25000));
        bookList.add(new Book("파이썬", 15000));
        bookList.add(new Book("안드로이드", 30000));

        int total = bookList.stream().mapToInt(book -> book.getPrice()).sum();

        bookList.stream().filter(book -> book.getPrice() >= 20000).map(book -> book.getName()).sorted().forEach(name -> System.out.print(name + " "));
    }
}
