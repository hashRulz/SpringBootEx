package com.visitor.visitormanagement_2.controller;

import com.visitor.visitormanagement_2.domain.Book;
import com.visitor.visitormanagement_2.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/book")
public class BookController {

   @Autowired
    BookService bookService;

   @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void saveBook(@RequestBody Book book){
       bookService.save(book);
   }

}
