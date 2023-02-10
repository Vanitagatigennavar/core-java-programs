package com.xworkz.Arrayaprograms;

public class SecondHighest3 {

	public static void main(String[] args) {
		int []a= {1,4,6,8,10,24,36};
		int temp;
		int total=a.length;
		
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[j]=a[i];
					temp=a[j];
				}
			}
		}
		
	System.out.println("second heighest number"+a[total-2]);			
		
	}

}
