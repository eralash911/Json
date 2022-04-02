package com.domain.Json.repositories;

import com.domain.Json.entityes.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person, Long> {
}
