package com.sdapps.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Origin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy="origin")
	private Collection<StudentApplication> applications;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<StudentApplication> getApplications() {
		return applications;
	}

	public void setApplications(Collection<StudentApplication> applications) {
		this.applications = applications;
	}
	
}
