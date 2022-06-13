//To demonstrate simple Triangle pattern program
class Triangle 
{
             void TriangleMatrix()
   {
             for(int row=i;row<=10;row++)
			 {
{
	         for(int col=row;col<=row; col++)
			 {
		        System.out.println("");
             }
             for(int col=1; col<=row;col++)
             {
	              System.out.println("");
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