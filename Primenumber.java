# saran
package Activity12;

import java.util.Scanner;

public class Primenumber {


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter");
		int s=scanner.nextInt();
		int n=s/2;
		int count=0;
		for(int i=2;i<=n;i++)
		{
			if(s%i==0)
			{
				count=1;
			}
		}
		if(count==0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
	
scanner.close();
	}

}


