package com.xworkz_collectionTest_set_set_tree_set_comparemethod;

public class ClassStudent implements Comparable<ClassStudent> {
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
		return "ClassStudent [name=" + name + ", id=" + id + ", combination=" + combination + "]";
	}
	
	@Override
	public int compareTo(ClassStudent student) {
	  if(this.id<student.id) {
		  return -1;}
	  
	  else if (this.id>student.id) {
	   return +1;}
	  else {
	    return 0;
	}
	}
}
