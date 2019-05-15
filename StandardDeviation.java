package practice;

import java.util.Scanner;

public class StandardDeviation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i , n ,sum =0 , mean , sub , b=0 ,v;
		double s;
		System.out.println("enter the number of elements:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int []a= new int[n];
		System.out.println("enter elements:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum = sum+a[i];
		}
		mean=sum/n;
		System.out.println("mean is:"+mean);
		for(i=0;i<n;i++)
		{
			sub = (int) Math.pow(a[i]-mean, 2);
			b=b+sub;
			
			
		}
		System.out.println(b);
		v = b/n ;
		s = Math.sqrt(v);
		System.out.println("Standard deviation is "+s);
		

	}

}
