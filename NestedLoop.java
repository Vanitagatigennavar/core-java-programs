class NestedLoop  
{
public static void main(String[] args)
{
int weeks=3;
int days=7;
//outer loop
for(int i=1;i<=weeks;++i)
{
	System.out.println(" week:"+i);
	//inner loop
	for(int j=1;j<=days;++j)
	{
		System.out.println(" Days:"+j);lass Car{
   public Car()
   {
	System.out.println("Class Car");
   }
   public void vehicleType()
   {
	System.out.println("Vehicle Type: Car");
   }
}
class Maruti extends Car{
   public Maruti()
   {
	System.out.println("Class Maruti");
   }
   public void brand()
   {
	System.out.println("Brand: Maruti");
   }
   public void speed()
   {
	System.out.println("Max: 90Kmph");
   }
}
public class Maruti800 extends Maruti{

   public Maruti800()
   {
	System.out.println("Maruti Model: 800");
   }
   public void speed()
   {
	System.out.println("Max: 80Kmph");
   }
   public static void main(String args[])
   {
	 Maruti800 obj=new Maruti800();
	 obj.vehicleType();
	 obj.brand();
	 obj.speed();
   }
}
	}
	++i;
}
}
}
