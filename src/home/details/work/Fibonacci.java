package home.details.work;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n1=0,n2=1,n3,s,i;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter size");
		s = scan.nextInt();
		
		scan.close();
		
		System.out.println("fibonacci series");
		System.out.println("" +n1+ " " +n2);
		
		for(i=2;i<=s;i++)
		{
			n3 = n1 + n2;
			System.out.println(""+n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
