package Test;

import java.util.Scanner;

public class palindromeprogram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your value here");
	String STR =input.next();
		

		String orgstr = STR;
		String reverse = "";

		for (int i = orgstr.length() - 1; i >= 0; i--) {

			reverse = reverse + orgstr.charAt(i);
		}
		System.out.println(reverse);

		
		  if(orgstr.equals(reverse))
		  
		  {
		  
		  System.out.println("String is a palindrome ");
		  
		  } 
		  else { System.out.println("String is not  a palindrome ");
		  
		  }
		 
	}

}
