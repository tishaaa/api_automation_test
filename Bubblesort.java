package practice;

import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i , j ,t ,n;
		System.out.println("enter array length:");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		int [] a = new int[n];
		System.out.println("enter array:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
        for(i=0;i<n-1;i++)
        {
        	for(j=0;j<n-i-1;j++)
        	{
        		if(a[j]>a[j+1])
        		{
        			t=a[j];
        			a[j]=a[j+1];
        			a[j+1]=t;
        		}
        	}
        }
        for(i=0;i<n;i++)
        {
        	System.out.print(a[i]);
        }
	}

}
