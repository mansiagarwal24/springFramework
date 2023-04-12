package com.JPAPart3.JPAPart3.OneToMany.WithoutAdditionalTable;

import com.JPAPart3.JPAPart3.OneToMany.Bidirectional.AuthorManyOne;
import jakarta.persistence.*;

@Entity
public class BookTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int book_id;
    private String book_name;

    @ManyToOne
    @JoinColumn(name="author_id")
    private AuthorTable authorTable;

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

    public AuthorTable getAuthorTable() {
        return authorTable;
    }

    public void setAuthorTable(AuthorTable authorTable) {
        this.authorTable = authorTable;
    }
}
