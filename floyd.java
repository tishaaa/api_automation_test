package practice;

import java.util.Random;
import java.util.Scanner;

public class floyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int l, num = 1, n, k , i;
	     Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter the number of rows of floyd's triangle you want");
	      l = in.nextInt();
	 
	      System.out.println("Floyd's triangle :-");
	 
	      for ( n = 0 ; n < l ; n++ )
	      {   
	    	  for ( i = 0 ; i < l-n-1 ; i++ ) {
	    	  System.out.print(" ");
	    	  }
	    	  num=1;
	         for ( k = 0 ; k <= n ; k++ )
	         {  
	        	System.out.print(num+" ");
	            num=num*(n-k)/(k+1);
	            
	         }
	 
	         System.out.println();
	      }

	}

}
