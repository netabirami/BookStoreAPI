package com.example.Book_StoreInventory_Management.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Service
public class BookService {

    private final String jdbcUrl = "jdbc:mysql://localhost:3306/bookstore";
    private final String jdbcUser = "root";
    private final String jdbcPassword = "12345678";

    public List<Book> getAllBook() {
        List<Book> books = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM books");
            while (resultSet.next()) {
                Book book = new Book();
               book.setId(resultSet.getInt("id"));
               book.setTitle(resultSet.getNString("title"));
               book.getAuthor(resultSet.getString("author"));
               book.getPrice(resultSet.getDouble("price"));
               book.getQuantity(resultSet.getInt("quantity"));
               books.add(book);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return books;
    }
}


