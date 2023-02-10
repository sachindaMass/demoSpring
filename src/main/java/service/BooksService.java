package service;

import entity.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.BooksRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService {

    @Autowired
    BooksRepository booksRepository;

    public List<Books> getAllBooks() {
        List<Books> books = new ArrayList<>();
        for (Books books1 : booksRepository.findAll()) {
            books.add(books1);
        }
        return books;
    }

    public Books getBooksById(int bookId) {
        return booksRepository.findById(bookId).get();
    }

    public void delete(int bookId) {
        booksRepository.deleteById(bookId);
    }

    public void saveOrUpdate(Books books) {
        booksRepository.save(books);
    }

    public void update(Books books, int bookId) {
        booksRepository.save(books);
    }
}
