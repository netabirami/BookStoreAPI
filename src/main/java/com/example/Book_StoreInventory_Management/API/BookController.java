package com.example.Book_StoreInventory_Management.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private BookService bookService;
    @Autowired
    public BookController (BookService bookService){
        this.bookService=bookService;
    }
    @GetMapping
    public List<Book>getAllBooks(){
        return bookService.getAllBook();
    }



}
