package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "my_table_amal")
public class YourEntity {
//	 @Column(name = "name")
//	    private String name;

	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	// Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String columnName) {
		this.name = columnName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int agee) {
		this.age = agee;
	}
}
