package com.JPAPart3.JPAPart3.OneToMany.Bidirectional;

import jakarta.persistence.*;

@Entity
public class BookManyOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int book_id;
    private String book_name;

    @ManyToOne
    private AuthorManyOne authorManyOne;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public AuthorManyOne getAuthorManyOne() {
        return authorManyOne;
    }

    public void setAuthorManyOne(AuthorManyOne authorManyOne) {
        this.authorManyOne = authorManyOne;
    }
}
