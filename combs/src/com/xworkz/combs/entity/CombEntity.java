package com.xworkz.combs.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString(callSuper = true)
@Table(name="combs_info")

public class CombEntity extends ParentEntity {
	@Id
    @Min(value=1,message = "id is greaterthan zero")
	private int id;
    @NotNull
	private String name;
	@NotNull
	private Double price;
	
	private String location;
    @Min(value=10)
     @Max(value=1000)
	private int noofcombs;
    @Min(value=1000)
    @Max(value=50000)
	private int maxCapacity;
    
    public CombEntity(String name,Double price,String location,int noofcombs,int maxCapacity,String createdBy,LocalDate createdDate,String updatedBy,LocalDate updatedDate )
    {
    	super(createdBy,createdDate,updatedBy,updatedDate);
    	this.location=location;
    	this.name=name;
    	this.price=price;
    	this.noofcombs=noofcombs;
    	this.maxCapacity=maxCapacity;
    }

}
