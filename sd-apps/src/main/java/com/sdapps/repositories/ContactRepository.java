package com.sdapps.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sdapps.entities.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
