package practice;

import java.util.Scanner;

public class Binomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int l, num = 1, n, k , i ,px ,py;
	     Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter the number ");
	      l = in.nextInt();
	      px=l ;
	      py=0;
	      for ( k = 0 ; k <= l ; k++ )
	      {  
	        	if(num!=1)
	        	{
	        		System.out.print(num);
	        	}
	        	if(px!=0) {
	        
	        		if(px==1) {
	        			System.out.print("x" );
	        		}
	        		else
	        		{
	        			System.out.print("x^" + px );
	        		}
	        	} 
	        	
	        	if(py!=0) {
	        		if(py==1) {
	        			System.out.print("y" );
	        		}
	        		else
	        		{
	        			System.out.print("y^" + py );
	        		}
	        	}
	        	if(l!=k)
	        	{
	        		System.out.print(" + ");
	        	}
	        	
	            num=num*(l-k)/(k+1);
	            px--;
	            py++;
	            
	            
	      }

	}

}
