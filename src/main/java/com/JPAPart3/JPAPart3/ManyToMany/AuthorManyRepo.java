package com.JPAPart3.JPAPart3.ManyToMany;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.repository.CrudRepository;

public interface AuthorManyRepo extends CrudRepository<AuthorMany, Integer> {
}
