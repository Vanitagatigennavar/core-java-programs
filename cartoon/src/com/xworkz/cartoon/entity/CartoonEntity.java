package com.xworkz.cartoon.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@NamedQueries({
//	@NamedQuery(name="findByName",query="select cartoon from CartoonEntity cartoon where cartoon.name=:name"),//execute
//	@NamedQuery(name = "getCount", query = "select count(*)from CartoonEntity"),//notExecute
//	@NamedQuery(name="findByMaxCreatedDate",query="select max(cartoon.createdDate) from CartoonEntity cartoon "),
//	@NamedQuery(name = "findAll", query = "select cartoon from CartoonEntity cartoon where name = :nm and country = :c and gender = :gd and author = :aut"),
//	@NamedQuery(name="findAuthor",query="select cartoon.author from CartoonEntity cartoon where cartoon.name=:name"),
//    @NamedQuery(name="findcreatedDate",query="select cartoon.createdDate from CartoonEntity cartoon where cartoon.author=:at"),
    @NamedQuery(name="findnameAndcountry",query="select cartoon.name, cartoon.country from CartoonEntity cartoon where cartoon.author=:at"),
//    @NamedQuery(name="updateAuthor",query="update CartoonEntity cartoon set cartoon.author=:at and cartoon.name =:nme"),//notexecute
//      @NamedQuery(name="updateTypeByName",query="update CartoonEntity cartoon set cartoon.type=:ty and cartoon.name=:nm")//notexecute
//       @NamedQuery(name="deleteByName",query="delete from CartoonEntity cartoon where cartoon.name=:nm")
//    @NamedQuery(name="findAllByList",query = "select cartoon from CartoonEntity cartoon"),//execute
//	@NamedQuery(name="findAllByAuthor",query="select cartoon from CartoonEntity cartoon where cartoon.author = :aut"),
//     @NamedQuery(name="findAllByAuthorAndGender",query="select cartoon from CartoonEntity cartoon where cartoon.author=:atu and cartoon.gender=:gen"),	
//	@NamedQuery(name="findAllName",query="select cartoon.name from CartoonEntity cartoon"),
//	@NamedQuery(name="findAllCountry",query="select cartoon.country from CartoonEntity cartoon"),
//	@NamedQuery(name="findAllNameAndCountry",query="select cartoon.name,cartoon.country from CartoonEntity cartoon"),
//	@NamedQuery(name="findAllNameAndCountryAndAuthor",query="select cartoon.name,cartoon.country,cartoon.author from CartoonEntity cartoon")
})
public class CartoonEntity extends ParentEntity {

	@GenericGenerator(name = "auto", strategy = "Increment")
	// @GeneratedValue(generator = "auto")
	@Id
	private int cid;
	private String name;
	private String country;
	private String gender;
	private String author;
	private String type;

	public CartoonEntity(String name, String country, String gender, String author, String type,
			LocalDateTime createdDate, LocalDateTime updateDate, String createdBy, String updatedBy) {
		super(createdDate, updateDate, createdBy, updatedBy);

		this.name = name;
		this.country = country;
		this.gender = gender;
		this.author = author;
		this.type = type;
	}

}
