package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Books {

    @Id
    @Column
    private int bookId;

    @Column
    private String bookname;

    @Column
    private String author;

    @Column
    private int price;

    public Books(int bookId, String bookname, String author, int price) {
        this.bookId = bookId;
        this.bookname = bookname;
        this.author = author;
        this.price = price;
    }

    public Books() {

    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
