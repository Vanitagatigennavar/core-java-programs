package com.xworkz.array.multidimensionalarray;
public class StudentclassTest {
public static void main(String[] args) {
        Studentclass s1=new Studentclass("vanita", 615622);
        Studentclass s2=new Studentclass("varsha", 615623);
        Studentclass s3=new Studentclass("nayana", 615624);
        Studentclass s4=new Studentclass("vasu", 615625);
        Studentclass[] Students= {s1,s2,s3,s4};
        
        for (int i = 0; i < Students.length; i++) {
        	
        	System.out.println(Students[i]);
        	}
        }
}
