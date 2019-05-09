package com.costshare.transactions.repo;

import com.costshare.transactions.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface PersonRepo extends CrudRepository<Person, Long> {

    List<Person> findByName(@Param("name") String name);
}
