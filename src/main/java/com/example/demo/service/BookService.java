package com.example.demo.service;

import com.example.demo.model.entity.Book;
import com.example.demo.model.repository.BookRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Method to get all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Method to save a book
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    // Method to delete a book by ID
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    // Initialize sample books if the repository is empty
    @PostConstruct
    public void init() {
        if (bookRepository.count() == 0) {
            bookRepository.save(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction"));
            bookRepository.save(new Book("1984", "George Orwell", "Dystopian"));
            bookRepository.save(new Book("To Kill a Mockingbird", "Harper Lee", "Fiction"));
        }
    }
}
