package com.JPAPart3.JPAPart3.OneToOne;

import com.JPAPart3.JPAPart3.Author;
import jakarta.persistence.*;

@Entity
public class BookOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private String bookName;
    @OneToOne
    private AuthorOne authorOne;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public AuthorOne getAuthorOne() {
        return authorOne;
    }

    public void setAuthorOne(AuthorOne authorOne) {
        this.authorOne = authorOne;
    }

    @Override
    public String toString() {
        return "BookOne{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", authorOne=" + authorOne +
                '}';
    }
}
