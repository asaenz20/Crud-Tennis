package com.developer.crud.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.developer.crud.model.entity.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long>{

	List<Client> findByName(String name);

}
