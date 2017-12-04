package com.sdapps.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_address")
public class StudentAddress {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private Boolean primary;
	
	@ManyToOne
	@JoinColumn(name="address_id")
	private Address address;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getPrimary() {
		return primary;
	}

	public void setPrimary(Boolean primary) {
		this.primary = primary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
}
