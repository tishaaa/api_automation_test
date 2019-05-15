package practice;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i , n , r=1 , p ,res;
		System.out.println("enter the number : ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter the power:");
		Scanner scn = new Scanner(System.in);
		p=scn.nextInt();
		if(n>=0 && p==0) {
			r=1;
			System.out.println("result"+r);
		}
		else if(n==0 && p>=0) {
			r=0;
			System.out.println("result"+r);
		}
		else
		{
			for(i=1;i<=p;i++)
			{  
				r = r * n;
				
			}
			System.out.println("result:"+r);
			
		
		}
		
		

	}

}
