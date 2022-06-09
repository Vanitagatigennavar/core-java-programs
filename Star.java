class Star
{
	
	public static void main(String[] args)
{
		int i,j,row=6;
		for( i=0;i<row;i++)
	{
		for( j=2*(row-i);j>=0;j--)
		{
			System.out.println(" ");
		}
		for(j=0;j<=i;j++)
		{
			System.out.println("*");
		}
		    System.out.println();
	}		
}
}
