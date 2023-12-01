package com.example.Book_StoreInventory_Management.API;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private double price;
    private Integer quantity;

    public Book(Integer id, String title, String author, double price, Integer quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public Book() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor(String author) {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice(double price) {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getQuantity(int quantity) {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
