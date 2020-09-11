package home.details.work;

import java.util.Scanner;

public class PermutationCombination {

	public static int fact (int n) {
		
	int fact=1,i;
	
	for(i=1;i<=n;i++)
	{
		fact = fact * i;
	}
	return fact;
	
	}
	public static void main(String[] args) {
		
		int n,r;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n value");
		n = scan.nextInt();
		
		System.out.println("enter r value");
		r = scan.nextInt();
		
		
		System.out.println("NPR =" +(fact(n)/fact(n-r)));
		System.out.println("NCR =" +(fact(n)/fact(n-r)*fact(r)));
	}
}