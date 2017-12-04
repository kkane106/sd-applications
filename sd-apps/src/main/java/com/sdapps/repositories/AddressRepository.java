package com.sdapps.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sdapps.entities.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {

}
