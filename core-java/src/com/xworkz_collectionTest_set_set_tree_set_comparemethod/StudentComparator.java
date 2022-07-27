package com.xworkz_collectionTest_set_set_tree_set_comparemethod;

import java.util.Comparator;

public class StudentComparator implements Comparator<ClassStudent>  {
	 private String name;
     private  int id;
     private  String combination;
	public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    public int getId() {
		return id;
	}
    public void setId(int id) {
		this.id = id;
	}
     public String getCombination() {
		return combination;
	}
     public void setCombination(String combination) {
		this.combination = combination;
	}
     
@Override
	public String toString() {
		return "StudentComparator [name=" + name + ", id=" + id + ", combination=" + combination + "]";
	}
@Override
	public int compare(ClassStudent cs1, ClassStudent cs2) {
		if(cs1.getId()<cs2.getId()) {
			return +1;
			}
		else if(cs1.getId()>cs2.getId()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}