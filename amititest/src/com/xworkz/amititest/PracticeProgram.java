package com.xworkz.amititest;

public class PracticeProgram {
	
	  
		 int data=50;  
		  
		 void change(int i){  
		 i=i+100;//changes will be in the instance variable  
		 }  
		     
		    
		 public static void main(String args[]){  
			 PracticeProgram op=new PracticeProgram();  
		  
		   System.out.println("before change "+op.data);  
		   op.change(25);//passing object  
		   System.out.println("after change "+op.data);  
		  
		 }  
		}  


