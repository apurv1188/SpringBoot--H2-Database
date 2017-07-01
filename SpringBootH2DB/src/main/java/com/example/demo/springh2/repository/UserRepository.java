package com.example.demo.springh2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.springh2.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findAll();
}
