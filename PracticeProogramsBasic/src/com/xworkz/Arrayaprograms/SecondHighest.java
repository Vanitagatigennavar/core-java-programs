package com.xworkz.Arrayaprograms;

public class SecondHighest {

	
	public static void main(String[] args) {
		
		
		int [] a= {25,45,87,46,47,48};
		
		int temp; 
		int total=a.length;
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }
		System.out.println(a[total-2]);
		        
		}  
	}

