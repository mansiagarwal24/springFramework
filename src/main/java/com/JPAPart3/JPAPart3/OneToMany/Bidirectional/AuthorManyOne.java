package com.JPAPart3.JPAPart3.OneToMany.Bidirectional;

import jakarta.persistence.*;

import java.util.Set;

@Entity
   public class AuthorManyOne {
       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
       private int authorId;
       private String authorName;
       @OneToMany(cascade = CascadeType.ALL)
       private Set<BookManyOne> book;

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Set<BookManyOne> getBook() {
        return book;
    }

    public void setBook(Set<BookManyOne> book) {
        this.book = book;
    }
}
