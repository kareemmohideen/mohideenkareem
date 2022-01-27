package kareem;
import java.util.Scanner;
public class prime {
	public static void main(String[] args) {
		int num;
		boolean prime=true;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		int n = scan.nextInt();
		scan.close();
		for(int i=2;i<n;i++)
		{
			
			if(n%i==0)
			{
				prime=false;
				break;
			}
			
		}
		if(prime)
		System.out.println(n+"is a prime");
		else
        System.out.println(n+"is not a prime");
		
		}
	}
	
	


