package controller;

import entity.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.BooksService;

import java.util.List;

@RestController
public class BooksController {

    @Autowired
    BooksService booksService;

    @GetMapping("/book")
    private List<Books> getAllBooks() {
        return booksService.getAllBooks();
    }

    @GetMapping("/book/{bookId}")
    private Books getBooks(@PathVariable("bookId") int bookId) {
        return booksService.getBooksById(bookId);
    }

    @DeleteMapping("/book/{bookId}")
    private void deleteBook(@PathVariable("bookId") int bookId) {
        booksService.delete(bookId);
    }

    @PostMapping("/books")
    private int saveBook(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books.getBookId();
    }

    @PutMapping("/books")
    private Books update(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books;
    }
}
