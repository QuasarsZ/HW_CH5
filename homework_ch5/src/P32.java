
public class P32 
{
	public static void main (String[] args)throws Car32Exception
	{
		Car32 car1 = new Car32(); 
		

		car1.setCar(1234, -10.0);

		car1.show();
	}
}

class Car32Exception extends Exception
{
}

class Car32
{
	private int num;
	private double gas;
	
	public Car32()
	{
		num = 0;
		gas=0.0;
		System.out.println("已生產了汽車");
	}
	
	public void setCar(int n, double g)throws Car32Exception
	{
		if(g<0)
		{
			Car32Exception e = new Car32Exception();
			throw e;
		}
		else
		{
			num=n;
			gas=g;
			System.out.println("將車號設為"+num+"將汽油量設為"+gas);		
		}

	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}

}
