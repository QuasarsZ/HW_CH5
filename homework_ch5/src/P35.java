import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class P35 
{
	public static void main (String[] args)
	{

		
		try
		{
			FileWriter fw = new FileWriter("test1.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hellow");
			pw.println("GoodBye");
			
			pw.close();
			
			System.out.println("��Ƥw�g�g�J�ɮ�");
		}
		catch(IOException e)
		{
			System.out.println("��X���~");
		}
		
		
	}

}
