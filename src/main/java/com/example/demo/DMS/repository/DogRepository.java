
/*
 * @author   Meghala Anumolu 
 * S559964
 * 
 */



package com.example.demo.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);

}
