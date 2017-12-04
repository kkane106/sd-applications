package com.sdapps.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="student_application")
public class StudentApplication {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="createdate")
	private Date createDate;
	
	@Column(name="updatedate")
	private Date updateDate;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="cohort_id")
	private Cohort cohort;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="origin_id")
	private Origin origin;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Cohort getCohort() {
		return cohort;
	}

	public void setCohort(Cohort cohort) {
		this.cohort = cohort;
	}

	public Origin getOrigin() {
		return origin;
	}

	public void setOrigin(Origin origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "StudentApplication [id=" + id + ", createDate=" + createDate + ", updateDate=" + updateDate
				+ ", student=" + student + ", cohort=" + cohort + ", origin=" + origin + "]";
	}
	
	
	
}
