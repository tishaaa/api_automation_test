package practice;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i , j , n ,t;
		System.out.println("enter number of elements:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int []a= new int[n];
		System.out.println("enter the elements:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			for(j=i;j>=0;j--)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
				else
				{
					break;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}

	}

}
