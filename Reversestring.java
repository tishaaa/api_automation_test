package practice;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ;
		char r = 0;
		int i , n ;
		System.out.println("enter the string:");
		Scanner sc = new Scanner(System.in);
		s=sc.next();
		char[] ch = s.toCharArray();
		n=ch.length;
		for(i=n-1;i>=0;i--)
		{
			r = ch[i];
			System.out.println(r);
		}
		if(s.equals(r))
		{
			System.out.println(r+"is pallindrome");
		}
		else
		{
			System.out.println(r+"is not pallindrome");
		}
		

	}

}
