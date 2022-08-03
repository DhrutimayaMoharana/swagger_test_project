package com.swagPack.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swagPack.test.entity.ContactBook;
import com.swagPack.test.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public ContactBook saveContact(ContactBook contactBook) {
		return contactRepository.save(contactBook);
	}

	@Override
	public List<ContactBook> find() {
		// TODO Auto-generated method stub
		return contactRepository.findAll();
	}

	@Override
	public Optional<ContactBook> findById(int id) {
		// TODO Auto-generated method stub
		return contactRepository.findById(id);
	}

}
