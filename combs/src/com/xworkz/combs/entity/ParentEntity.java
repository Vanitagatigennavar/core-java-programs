package com.xworkz.combs.entity;

import java.time.LocalDate;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Data
@NoArgsConstructor
@MappedSuperclass

public class ParentEntity {
	

	private String createdBy;
	private LocalDate createdDate;
	private String updatedBy;
	private LocalDate updatedDate;

}
