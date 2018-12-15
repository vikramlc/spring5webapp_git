package com.vikram.springboot.repositories;

import com.vikram.springboot.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
