package com.test.billsystem.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="school")
public class School {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int schoolId;
	
	@NotNull
	@Column(name="school_name")
	private String schoolName;
	
	@NotNull
	@Column(name="school_address")
	private String schoolAddress;
	
	@NotNull
	@Column(name="school_type")
	private String schoolType;
	
	@OneToMany(mappedBy="school")
	private List<Student> student;
	
	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

}
