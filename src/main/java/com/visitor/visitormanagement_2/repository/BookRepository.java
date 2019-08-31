package com.visitor.visitormanagement_2.repository;

import com.visitor.visitormanagement_2.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
