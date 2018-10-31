package org.wecancodeit.ajaxdemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

	@Id @GeneratedValue private Long id;
	private String name;
	private String favLanguage;
	
	public Student() {}

	public Student(String name, String favLanguage) {
		this.name = name;
		this.favLanguage = favLanguage;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getFavLanguage() {
		return favLanguage;
	}
	
}
