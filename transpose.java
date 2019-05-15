package practice;

import java.util.Scanner;

public class transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i , j , r , c ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows:");
		r=sc.nextInt();
		System.out.println("enter number of coloumns:");
		c=sc.nextInt();
		int [][] a = new int[r][c];
		System.out.println("enter a matrix:");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		int [][]b = new int[c][r];
		for(j=0;j<c;j++) {
			for(i=0;i<r;i++)
			{  
				b[j][i]=a[i][j];
				
			}
		}
		for(i=0;i<c;i++) {
			for(j=0;j<r;j++)
			{  
				System.out.print(b[i][j]+" "); 
				
				
			}
			System.out.println(" ");
		}
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++)
			{  
				System.out.print(a[i][j]+" "); 
				
				
			}
			System.out.println(" ");
		}
		

	}

}
