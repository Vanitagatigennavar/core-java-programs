package com.xworkz.amititest;

public class Exception {

	public static void main(String[] args) {
//		try {
//			int data =100/10;
//			
//		}catch(ArithmeticException e) {
//		System.out.println(e);
//
//	}
//		System.out.println("rest of code");
//	}
//}
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("common task completed");
		}
		System.out.println("rest of the code...");
	}
}

//try{    
//    int a[]=new int[5];    
//    a[5]=30/0;    
//    System.out.println(a[10]);  
//   }    
//   catch(ArithmeticException e)  
//      {  
//       System.out.println("Arithmetic Exception occurs");  
//      }    
//   catch(ArrayIndexOutOfBoundsException e)  
//      {  
//       System.out.println("ArrayIndexOutOfBounds Exception occurs");  
//      }    
//   catch(Exception e)  
//      {  
//       System.out.println("Parent Exception occurs");  
//      }             
//   System.out.println("rest of the code");    
//}  
//}  