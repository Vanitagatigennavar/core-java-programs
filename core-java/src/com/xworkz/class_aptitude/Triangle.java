package com.xworkz.class_aptitude;

public class Triangle {
        void triangleMatrix()
{
    for(int row=1;row<=5;row++)
	 {

    for(int col=row;col<=5; col++)
	 {
       System.out.print(" ");
    }
    for(int col=1; col<=row;col++)
    {
         System.out.print("* ");
    }
         System.out.println();
}
}
      public static void main(String[] args)
{
       Triangle matrix=new Triangle();
       matrix.triangleMatrix();
}
}

