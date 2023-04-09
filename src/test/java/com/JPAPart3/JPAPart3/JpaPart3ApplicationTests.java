package com.JPAPart3.JPAPart3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Optional;

@SpringBootTest
class JpaPart3ApplicationTests {
	@Autowired
	AuthorRepository authorRepository;
    @Autowired
    BookRepository bookRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testManyToManyRel(){
		Author author = new Author();
		author.setAuthorName("William Shakespeare");
		Address address = new Address();
		address.setLocation("Bandra");
		address.setState("Mumbai");
		address.setStreetNo(13);
		author.setAddress(address);
		HashSet<Book> books= new HashSet<Book>();
		Book book = new Book();
		book.setBookName("A time to kill");
        books.add(book);
        //author.setBooks(books);
		authorRepository.save(author);
	}

    @Test
    public void testOneToManyMapping(){
        Author a= new Author();
        a.setAuthorName("Jai");
        Address add = new Address();
        add.setLocation("Agra");
        add.setState("UP");
        add.setStreetNo(14);
        a.setAddress(add);
        HashSet<Book> books= new HashSet<Book>();
        Book b = new Book();
        b.setBookName("Once Upon a Time");
        books.add(b);
        a.setBook(books);
        authorRepository.save(a);
    }

//    @Test
//    public void testOneToOneMapping(){
//        Book book1 = new Book();
//        book1.setBookName("Two States");
//        Author author1 = new Author();
//        author1.setAuthorName("Chetan Bhagat");
//        Address add1 = new Address();
//        add1.setStreetNo(13);
//        add1.setState("Delhi");
//        add1.setLocation("New Delhi");
//        author1.setAddress(add1);
//        book1.setAuthor(author1);
//        bookRepository.save(book1);
//    }



}
