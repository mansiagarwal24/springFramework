package com.JPAPart3.JPAPart3.ManyToMany;

import com.JPAPart3.JPAPart3.Author;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class BookMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private String bookName;

    @ManyToMany
    private Set<AuthorMany> authorManySet;
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Set<AuthorMany> getAuthors() {
        return authorManySet;
    }

    public void setAuthors(Set<AuthorMany> authorManySet) {
        this.authorManySet = authorManySet;
    }

    @Override
    public String toString() {
        return "BookMany{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", authorManySet=" + authorManySet +
                '}';
    }
}
