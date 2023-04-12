package com.JPAPart3.JPAPart3.OneToOne;

import com.JPAPart3.JPAPart3.Address;
import com.JPAPart3.JPAPart3.Book;
import com.JPAPart3.JPAPart3.StringListConverter;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class AuthorOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String authorName;
    @OneToOne(cascade = CascadeType.ALL)
    private BookOne bookOne;


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

    public BookOne getBookOne() {
        return bookOne;
    }
    public void setBookOne(BookOne bookOne) {
        this.bookOne = bookOne;
    }

    @Override
    public String toString() {
        return "AuthorOne{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", book=" + bookOne +
                '}';
    }
}
