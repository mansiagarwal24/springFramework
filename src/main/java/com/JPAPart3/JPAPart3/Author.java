package com.JPAPart3.JPAPart3;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authorId;
    private String authorName;
    @Embedded
    private Address address;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    private Set<Book> book;

    // ONE-TO-ONE MAPPING
//    @OneToOne(mappedBy = "author")
//    private Book book;

    // USED FOR MANY-TO-MANY MAPPING

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "Author_Book",
//            joinColumns = @JoinColumn(name="author_id",referencedColumnName = "authorId"),
//            inverseJoinColumns = @JoinColumn(name = "book_id",referencedColumnName = "bookId"))
//    private Set<Book> books;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Book> getBook() {
        return book;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }
//ONE-TO-ONE
//    public Book getBook() {
//        return book;
//    }
//
//    public void setBook(Book book) {
//        this.book = book;
//    }


    // MANY-TO-MANY
//    public Set<Book> getBooks() {
//        return books;
//    }
//
//    public void setBooks(Set<Book> books) {
//        this.books = books;
//    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorId=" + authorId +
                ", address=" + address +
                ", books=" + book +
                '}';
    }
}
