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
public class BookDemo {
    public static void main(String[] args) {
        Author author1 = new Author("Tran Minh Quang", 21, "quangtm2103@gmail.com");
        System.out.println(author1);
        Book book1 = new Book("Harry Potter", 700, 50.2, new Author("J K Rolling", 70, "jkrolling@gmail.com"));
        
        System.out.println(book1);
        System.out.format("Book's Author's name: %s\n", book1.getAuthorName());
    }
}
