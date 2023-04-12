package com.JPAPart3.JPAPart3.OneToMany.WithoutAdditionalTable;

import com.JPAPart3.JPAPart3.OneToMany.Bidirectional.AuthorManyOne;
import org.springframework.data.repository.CrudRepository;

public interface Author3rd extends CrudRepository<AuthorTable,Integer> {

}
