/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composition;

/**
 *
 * @author Minnn
 */
public class Book {
    private String bookName;
    private int noOfPages;
    private double price;
    private Author author;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    
    public Book(String bookName, int noOfPages, double price, Author author) {
        this.bookName = bookName;
        this.noOfPages = noOfPages;
        this.price = price;
        this.author = author;
    }
    
    public Book(){
        
    }
    
    public String getAuthorName(){
        return author != null ? author.getName():"Author is null!";
    }

    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", noOfPages=" + noOfPages + ", price=" + price + ", author=" + author + '}';
    }

    
    
}
