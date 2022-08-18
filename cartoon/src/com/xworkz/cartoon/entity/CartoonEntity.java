package com.xworkz.cartoon.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cartoon_info")
public class CartoonEntity extends ParentEntity {

	@GenericGenerator(name = "auto", strategy = "Increment")
	// @GeneratedValue(generator = "auto")
	@Id
	private int id;
	private String name;
	private String country;
	private String gender;
	private String author;
	private String type;

	public CartoonEntity(String name, String country, String gender, String author, String type,
			LocalDateTime createdDate, LocalDateTime updatedDate, String createdBy, String updatedBy) {
		super(createdDate, updatedDate, createdBy, updatedBy);

		this.name = name;
		this.country = country;
		this.gender = gender;
		this.author = author;
		this.type = type;
	}

}
