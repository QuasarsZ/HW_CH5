
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
		System.out.println("�w�Ͳ��F�T��");
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
			System.out.println("�N�����]��"+num+"�N�T�o�q�]��"+gas);		
		}

	}
	
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}

}
