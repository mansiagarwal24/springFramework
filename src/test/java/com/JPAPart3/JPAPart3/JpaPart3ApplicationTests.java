package com.JPAPart3.JPAPart3;

import com.JPAPart3.JPAPart3.ManyToMany.AuthorMany;
import com.JPAPart3.JPAPart3.ManyToMany.AuthorManyRepo;
import com.JPAPart3.JPAPart3.ManyToMany.BookMany;
import com.JPAPart3.JPAPart3.OneToMany.Bidirectional.AuthorBiRepo;
import com.JPAPart3.JPAPart3.OneToMany.Bidirectional.AuthorManyOne;
import com.JPAPart3.JPAPart3.OneToMany.Bidirectional.BookManyOne;
import com.JPAPart3.JPAPart3.OneToMany.Unidirectional.AuthorOneMany;
import com.JPAPart3.JPAPart3.OneToMany.Unidirectional.AuthorUniRepo;
import com.JPAPart3.JPAPart3.OneToMany.Unidirectional.BookOneMany;
import com.JPAPart3.JPAPart3.OneToMany.WithoutAdditionalTable.Author3rd;
import com.JPAPart3.JPAPart3.OneToMany.WithoutAdditionalTable.AuthorTable;
import com.JPAPart3.JPAPart3.OneToMany.WithoutAdditionalTable.BookTable;
import com.JPAPart3.JPAPart3.OneToOne.AuthorOne;
import com.JPAPart3.JPAPart3.OneToOne.AuthorOneRepo;
import com.JPAPart3.JPAPart3.OneToOne.BookOne;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@SpringBootTest
class JpaPart3ApplicationTests {
	@Autowired
	AuthorRepository authorRepository;
    @Autowired
    AuthorUniRepo uniRepo;

    @Autowired
    AuthorOneRepo oneRepo;

    @Autowired
    AuthorManyRepo manyRepo;

    @Autowired
    AuthorBiRepo biRepo;

    @Autowired
    Author3rd author3rdrepo;

	@Test
	void contextLoads() {
	}


    @Test
    public void testCreateAuthorWithAddress(){
        Author author = new Author();
        author.setAuthorName("Mansi");

        Address address = new Address();
        address.setLocation("New Delhi");
        address.setState("Delhi");
        address.setStreetNo(12);
        author.setAddress(address);

        List<String> subjects = new ArrayList<>();
        subjects.add("English");
        subjects.add("Hindi");
        author.setSubjects(subjects);

        authorRepository.save(author);

    }
	@Test
	public void testManyToManyRel(){
		AuthorMany authorMany = new AuthorMany();
		authorMany.setAuthorName("William Shakespeare");
		HashSet<BookMany> books= new HashSet<BookMany>();
		BookMany b1 = new BookMany();
		b1.setBookName("A time to kill");
        books.add(b1);

        BookMany b2 = new BookMany();
        b2.setBookName("Flying Kite");
        books.add(b2);
        authorMany.setBookManySet(books);
		manyRepo.save(authorMany);
	}

    @Test
    public void testOneToOneMapping(){
        AuthorOne auth1 = new AuthorOne();
        auth1.setAuthorName("Jai");
        BookOne b1 = new BookOne();
        b1.setBookName("Little World");
        auth1.setBookOne(b1);
        b1.setAuthorOne(auth1);
        oneRepo.save(auth1);
    }

    @Test
    public void testOneManyUni(){
        AuthorOneMany auth = new AuthorOneMany();
        auth.setAuthorName("Rashmi");

        HashSet<BookOneMany> books= new HashSet<BookOneMany>();
        BookOneMany b = new BookOneMany();
        b.setBook_name("Secret");
        books.add(b);
        auth.setBook(books);

        uniRepo.save(auth);
    }

    @Test
    public void testManyOneBi(){
        AuthorManyOne a2 = new AuthorManyOne();
        a2.setAuthorName("Chetan");
        HashSet<BookManyOne> bookset = new HashSet<>();
        BookManyOne bookManyOne = new BookManyOne();
        bookManyOne.setBook_name("Two States");
        bookset.add(bookManyOne);
        a2.setBook(bookset);
        bookManyOne.setAuthorManyOne(a2);
        biRepo.save(a2);
    }

    @Test
    public void testManyOneBiWithout3rdTable(){
        AuthorTable a2 = new AuthorTable();
        a2.setAuthorName("Tisha");
        HashSet<BookTable> booksets = new HashSet<>();
        BookTable book = new BookTable();
        book.setBook_name("Inner Beauty");
        booksets.add(book);
        book.setAuthorTable(a2);
        a2.setBookTable(booksets);
        author3rdrepo.save(a2);
    }

}
