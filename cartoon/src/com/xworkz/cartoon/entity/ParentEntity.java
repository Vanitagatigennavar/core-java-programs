package com.xworkz.cartoon.entity;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass

public class ParentEntity {
	
	
	private  LocalDateTime createdDate;
	private LocalDateTime updatedDate;
	private String createdBy;
	private String updatedBy;

	
}
