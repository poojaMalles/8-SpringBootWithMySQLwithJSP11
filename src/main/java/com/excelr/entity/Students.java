package com.excelr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students_list")
public class Students {
	@Id
	@Column(name="id")
	private int s_id;
	@Column(name="name")
	private String s_name;
	@Column(name="dept")
	private String s_dept;
	@Column(name="image")
	private String s_image;
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int s_id, String s_name, String s_dept, String s_image) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_dept = s_dept;
		this.s_image = s_image;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_dept() {
		return s_dept;
	}

	public void setS_dept(String s_dept) {
		this.s_dept = s_dept;
	}

	public String getS_image() {
		return s_image;
	}

	public void setS_image(String s_image) {
		this.s_image = s_image;
	}

	@Override
	public String toString() {
		return "Students [s_id=" + s_id + ", s_name=" + s_name + ", s_dept=" + s_dept + ", s_image=" + s_image + "]";
	}
	
	
	
	
	
}
