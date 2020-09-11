package home.details.work;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		
		int n,rev=0,rem,temp;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter value");
		n = scan.nextInt();
		
		temp = n;
		
		while(n!=0)
		{
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n/10;
		}
		if(temp == rev)
		{
			System.out.println(+temp+"Number is Palindrome");
		}
		else
		{
			System.out.println(+temp+"Not A Palindrome Number");
		}
	}
}
