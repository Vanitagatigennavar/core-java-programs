package com.xworkz.computer.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name= "computer_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ComputerEntity {
   
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="companyName")
	private String companyName;
	@Column(name="personName")
	private String personName;
	@Column(name="cratedDate")
	private LocalDate cratedDate;
	@Column(name="updateDate")
	private LocalDate updateDate;
	@Column(name="createdTime")
	private LocalTime createdTime;
	@Column(name="updateTime")
	private LocalTime updateTime;
	@Column(name="price")
	private Double price;
	
}
