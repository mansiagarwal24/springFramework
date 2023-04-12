package com.JPAPart3.JPAPart3;

import com.JPAPart3.JPAPart3.Address;
import com.JPAPart3.JPAPart3.Book;
import com.JPAPart3.JPAPart3.StringListConverter;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String authorName;
    @Embedded
    private Address address;

    @Column
    @Convert(converter = StringListConverter.class)
    private List<String> subjects;

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

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorId=" + authorId +
                ", address=" + address +
                '}';
    }
}
