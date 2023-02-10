package com.xworkz.Arrayaprograms;

public class SecondHighest4 {

	public static void main(String[] args) {
		int []a= {11,34,56,79,89,65,99};
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
		System.out.println("second heighest number=="+a[total-2]);
}
}
