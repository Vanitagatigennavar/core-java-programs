package com.xworkz.freedomfighter.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

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
@Entity
@Table(name="freedom_fighter")
@MappedSuperclass
//@NamedQueries({
	
//	@NamedQuery(name = "findAll", query = "select freedomfighter from FreedomFighterEntity freedomfighter"),
//		
//})

public class FreedomFighterEntity extends ParentEntity  {
	@GenericGenerator(name = "auto", strategy = "Increment")
	@Id
	
	private Integer fightersId;
	private String fighterName;
	private LocalDateTime fighterDOB;
	private String FighterBornLocation;

	public FreedomFighterEntity (String fightersName,LocalDateTime fighterDOB, String FightersBornLocation,String createdBY,LocalDateTime createdDate,String updatedBy,LocalDateTime updatedDate ){
		
		super(createdBY,createdDate,updatedBy,updatedDate);
		this.fightersId = fightersId;
		this.fighterName = fightersName;
		this.fighterDOB = fighterDOB;
		this.FighterBornLocation = FightersBornLocation;
	}
}



