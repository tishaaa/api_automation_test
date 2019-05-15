package practice;

import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i , j , n;
		System.out.println("enter the number:");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		int []a = new int[n];
		for(i=2;i<n;i++) {
			a[i]=1;
		}
		long startTime = System.currentTimeMillis();
		
		for(i=2; i<Math.sqrt(n); i++) 
		{
			if(a[i]!=0) 
			{
				for(j=i*i;j<n;j=j+i)
				{
					a[j]=0;
				}
			}
		}
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		/*for(i=2;i<n;i++) {
		   if(a[i]==1)
		{
			System.out.println(i);
		}
		}*/
		

	}

}
