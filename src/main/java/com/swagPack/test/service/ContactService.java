package com.swagPack.test.service;

import java.util.List;
import java.util.Optional;

import com.swagPack.test.entity.ContactBook;

public interface ContactService {
	
	public ContactBook saveContact(ContactBook contactBook);
	
	public List<ContactBook> find();
	
	public Optional<ContactBook> findById(int id);
	
}
