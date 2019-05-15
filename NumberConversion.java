package practice;

import java.util.Scanner;

public class NumberConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i , n , r ;
        int b[] = new int[50];
        System.out.println("enter the decimal number :");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        i=0;
        while(n>0)
        {
        	b[i++] = n%2;
        	//System.out.print(r);
        	n=n/2;
        }
        for(int j = i-1;j>=0;j--)
    	{
    		System.out.print(b[j]);
    	}

	}

}
