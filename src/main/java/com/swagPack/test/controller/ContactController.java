package com.swagPack.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swagPack.test.entity.ContactBook;
import com.swagPack.test.service.ContactService;

@RestController
@RequestMapping("/api")
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/saveContact")
	public ContactBook saveContact(@ModelAttribute ContactBook contactBook) {
		return contactService.saveContact(contactBook);
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/findAll")
	public List<ContactBook> findAll() {
		return contactService.find();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/findById")
	public Optional<ContactBook> findAll(@RequestParam int id) {
		return contactService.findById(id);
	}
	
}
