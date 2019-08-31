package com.visitor.visitormanagement_2.service;

import com.visitor.visitormanagement_2.domain.Book;
import com.visitor.visitormanagement_2.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    BookRepository bookRepository;
    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }
}
