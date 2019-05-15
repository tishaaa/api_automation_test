package practice;

import java.util.Scanner;

public class Matrixmultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i , j , k , n ; 
		
		System.out.println("enter number of rows");
		Scanner r = new Scanner(System.in);
		n=r.nextInt();
		int [][] a = new int [n][n];
		int [][] b = new int [n][n];
		int [][] c = new int [n][n];
		System.out.println("enter first matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				
				a[i][j]=r.nextInt();
			}
		}
		System.out.println("enter second matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				b[i][j]=r.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				for(k=0;k<n;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("new matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
