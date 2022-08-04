package com.xworkz.dto;

import java.io.Serializable;

import com.xworkz.constants.Bartyfe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BarDTO implements Serializable {
   
	private Integer id;
	private String name;
	private String location;
	private Bartyfe tyfe=Bartyfe.DEFAULT;
	private Double avgCollectionPerDay;
	private Double avgCollectionPerMonth;
	
}
