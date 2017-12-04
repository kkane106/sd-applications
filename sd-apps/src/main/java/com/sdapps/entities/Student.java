package com.sdapps.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name="firstname")
	private String firstName;

	@Column(name="lastname")
	private String lastName;
	
	@OneToOne
	@JoinColumn(name="contact_id")
	private Contact contact;
	
	@ManyToMany
	@JoinTable(name="student_address",
		joinColumns=@JoinColumn(name="student_id"),
		inverseJoinColumns=@JoinColumn(name="address_id"))
	private Collection<Address> addresses;
	
	@OneToMany(mappedBy="student")
	private Collection<StudentAddress> studentAddresses;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Collection<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Collection<Address> addresses) {
		this.addresses = addresses;
	}

	public Collection<StudentAddress> getStudentAddresses() {
		return studentAddresses;
	}

	public void setStudentAddresses(Collection<StudentAddress> studentAddresses) {
		this.studentAddresses = studentAddresses;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
}
