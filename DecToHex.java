package practice;

import java.util.Scanner;

public class DecToHex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long decimalnum, quotient, remainder;
		    int i, j = 0;
		    char hex[]=new char[100];
		 
		    System.out.println("Enter decimal number: ");
		    Scanner in = new Scanner(System.in);
		    decimalnum=in.nextInt();
		 
		    quotient = decimalnum;
		 
		    while (quotient != 0)
		    {
		        remainder = quotient % 16;
		        if (remainder < 10)
		            hex[j++] = (char) (48 + remainder);
		        else
		            hex[j++] = (char) (55 + remainder);
		        quotient = quotient / 16;
		    }
		 
		    // display integer into character
		    for (i = j; i >= 0; i--) {
		    	System.out.print(hex[i]);
		    }
		            
		

	}

}
