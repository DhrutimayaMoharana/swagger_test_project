package com.swagger.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swagger.test.entity.ContactBook;

@Repository
public interface ContactRepository extends JpaRepository<ContactBook, Integer>{

	
}
