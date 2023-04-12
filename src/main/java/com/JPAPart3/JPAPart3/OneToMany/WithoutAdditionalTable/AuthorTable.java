package com.JPAPart3.JPAPart3.OneToMany.WithoutAdditionalTable;

import com.JPAPart3.JPAPart3.OneToMany.Bidirectional.BookManyOne;
import jakarta.persistence.*;

import java.util.Set;

@Entity
   public class AuthorTable {
       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
       private int authorId;
       private String authorName;
       @OneToMany(mappedBy = "authorTable",cascade = CascadeType.ALL)
       private Set<BookTable> bookTable;

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

    public Set<BookTable> getBookTable() {
        return bookTable;
    }

    public void setBookTable(Set<BookTable> bookTable) {
        this.bookTable = bookTable;
    }
}
