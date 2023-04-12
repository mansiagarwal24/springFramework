package com.JPAPart3.JPAPart3.OneToMany.Unidirectional;

import com.JPAPart3.JPAPart3.Address;
import jakarta.persistence.*;

import java.util.Set;
 @Entity
    public class AuthorOneMany {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int authorId;
        private String authorName;

        //ONE-TO-MANY
        @OneToMany(cascade = CascadeType.ALL)
        private Set<BookOneMany> book;

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

     public Set<BookOneMany> getBook() {
         return book;
     }

     public void setBook(Set<BookOneMany> book) {
         this.book = book;
     }
 }
