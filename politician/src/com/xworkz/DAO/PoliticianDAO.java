package com.xworkz.DAO;


import java.util.Collections;
import java.util.List;

import com.xworkz.DTO.PoliticianDTO;

public interface PoliticianDAO {
	boolean save(PoliticianDTO politiciandto);

	PoliticianDTO findById(int id);

	PoliticianDTO findByIdAndPresident(int id, String president);

	PoliticianDTO findByIdAndPresidentAndName(int id, String president, String name);

	PoliticianDTO findByIdAndName(int id, String name);

	String findNamebyId(int id);

	String findPresidentByIdAndName(int id, String name);

	int getTotal();

	PoliticianDTO findPartyByMaxMembers();
	
	default void test() {
		System.out.println("default impl of test");}
		
		default List <PoliticianDTO>findAll(){
			return Collections.EMPTY_LIST;
		}
		
		default List<String>findAllPartyName(){
			return Collections.EMPTY_LIST;
		}
		
      default List<Integer>findAllIds(){
      return Collections.EMPTY_LIST;


      }

}




