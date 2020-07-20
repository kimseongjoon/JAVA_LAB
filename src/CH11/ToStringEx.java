package CH11;

class Book {
    int bookNumber;
    String bookTitle;

    //생성자
    Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookNumber=" + bookNumber +
                ", bookTitle='" + bookTitle + '\'' +
                '}';
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Book book1 = new Book(200, "개미");
        Book book2 = new Book(100, "개미");

        System.out.println(book1); // 객체의 이름 출력
        System.out.println(book2);
    }
}