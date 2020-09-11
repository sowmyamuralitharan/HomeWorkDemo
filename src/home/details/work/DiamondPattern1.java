package home.details.work;

import java.util.Scanner;

public class DiamondPattern1 {

	public static void main(String[] args) {
		
		int n, i, j, space = 1;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        space = n - 1;
        for (i = 1; i <= n; i++) 
        {
            for (j = 1; j <= space; j++) 
            {
                System.out.print(" ");
            }
            space--;
            for (j = 1; j <= 2 * i - 1; j++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        space = 1;
        for (i = 1; i <= n - 1; i++) 
        {
            for (j = 1; j <= space; j++) 
            {
                System.out.print(" ");
            }
            space++;
            for (j = 1; j <= 2 * (n - i) - 1; j++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
