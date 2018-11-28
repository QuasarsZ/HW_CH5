
public class P55 
{
	public static void main (String[] args)
	{
		Company55 cmp = new Company55();
		
		Driver55 drv1=new Driver55(cmp);
		drv1.start();
		
		Driver55 drv2=new Driver55(cmp);
		drv2.start();
		

	}
}

class Company55
{
	private int sum =0;

	public synchronized void add (int a)
	{
		int temp=sum;
		System.out.println("�ثe�X�p�����B�O"+temp+"��");
		System.out.println("�Ȩ�"+a+"��");
		temp=temp+a;
		System.out.println("�X�p�����B�O"+temp+"��");
		sum= temp;
	}
}
class Driver55 extends Thread
{
	private Company55 comp;
	public Driver55(Company55 c)
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
