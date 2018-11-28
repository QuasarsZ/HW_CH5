
public class P30 
{
	public static void main (String[] args)
	{
		Car30 car1 = new Car30(); 
		
		try 
		{
			car1.setCar(1234, -10.0);
		}
		catch(CarException e)
		{
			System.out.println("�ߥX�F"+e+"�F");
		}
		car1.show();
	}
}

class CarException extends Exception
{
}

class Car30
{
	private int num;
	private double gas;
	
	public Car30()
	{
		num = 0;
		gas=0.0;
		System.out.println("�w�Ͳ��F�T��");
	}
	
	public void setCar(int n, double g)throws CarException
	{
		if(g<0)
		{
			CarException e = new CarException();
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
