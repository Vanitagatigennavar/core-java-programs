package com.xworkz.freedomfighter.entity;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@MappedSuperclass
public class ParentEntity {
		
		private String createdBy;
		private LocalDateTime createdDate;
		private String updatedBy;
		private LocalDateTime updatedDate;

	}


