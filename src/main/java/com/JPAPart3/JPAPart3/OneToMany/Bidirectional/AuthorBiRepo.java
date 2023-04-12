package com.JPAPart3.JPAPart3.OneToMany.Bidirectional;

import org.springframework.data.repository.CrudRepository;

public interface AuthorBiRepo extends CrudRepository<AuthorManyOne,Integer> {

}
