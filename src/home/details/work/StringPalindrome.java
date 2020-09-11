package home.details.work;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String a,b ="";
		int temp,i;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter String");
		a = scan.nextLine();
		
		temp = a.length();
		System.out.println(temp);
		for(i = temp - 1;i>=0;i--)
		{
			   b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(a))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}
	
