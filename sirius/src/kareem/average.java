package kareem;
import java.util.Scanner;

public class average {
	void  test()
	{
		int a;
		float averagef,sumf,totalf=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=scan.nextInt();
		for(a=1;a<=n;a++)
		{
			System.out.println("enter the number:"+a);
			 sumf=scan.nextInt();
			 scan.close();
			 totalf= sumf+totalf;
			 
			 
			 
		}
		averagef=totalf/n;
		System.out.println("average="+totalf);
		
		
	}
	public static void main(String[] args) {
		average avg=new average();
		avg.test();
		
	}

}
