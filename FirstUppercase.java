package practice;

import java.util.Locale;
import java.util.Scanner;

public class FirstUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ;
		int i;
		System.out.println("enter string:");
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		char[] ch = s.toCharArray();
		ch[0]=Character.toUpperCase(ch[0]);
		for( i = 1;i<ch.length;i++)
		{
			if(ch[i-1] == ' ')
			{
				ch[i]=Character.toUpperCase(ch[i]);
			}
			
		}
	for(i=0;i<ch.length;i++)
	{
		System.out.print(ch[i]);
	}
		

	}

}
