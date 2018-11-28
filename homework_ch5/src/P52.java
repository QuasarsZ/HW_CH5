
public class P52 
{
	public static void main (String[] args)
	{
		Company cmp = new Company();
		
		Driver drv1=new Driver(cmp);
		drv1.start();
		
		Driver drv2=new Driver(cmp);
		drv2.start();
		

	}
}

class Company
{
	private int sum =0;
	
	public void add (int a)
	{
		int temp=sum;
		System.out.println("目前合計的金額是"+temp+"元");
		System.out.println("賺到"+a+"元");
		temp=temp+a;
		System.out.println("合計的金額是"+temp+"元");
		sum= temp;
	}
}
class Driver extends Thread
{
	private Company comp;
	public Driver(Company c)
	{
		comp = c;
	}
	public void run()
	{
		for (int i=0;i<3;i++)
		{
			comp.add(50);
		}
	}

}
