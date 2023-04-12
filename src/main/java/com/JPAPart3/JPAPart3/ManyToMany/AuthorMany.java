package com.JPAPart3.JPAPart3.ManyToMany;

import com.JPAPart3.JPAPart3.Address;
import com.JPAPart3.JPAPart3.Book;
import com.JPAPart3.JPAPart3.StringListConverter;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class AuthorMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String authorName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "AuthorMany_BookMany",
            joinColumns = @JoinColumn(name="author_id",referencedColumnName = "authorId"),
            inverseJoinColumns = @JoinColumn(name = "book_id",referencedColumnName = "bookId"))
    private Set<BookMany> bookManySet;

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

    public Set<BookMany> getBookManySet() {
        return bookManySet;
    }

    public void setBookManySet(Set<BookMany> bookManySet) {
        this.bookManySet = bookManySet;
    }

    @Override
    public String toString() {
        return "AuthorMany{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", bookManySet=" + bookManySet +
                '}';
    }
}
