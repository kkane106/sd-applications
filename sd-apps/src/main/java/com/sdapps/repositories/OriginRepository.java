package com.sdapps.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sdapps.entities.Origin;

public interface OriginRepository extends CrudRepository<Origin, Integer> {
	public Origin findOneByName(String name);
}
