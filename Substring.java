package practice;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i , start , end;
		String s;
		System.out.println("enter string");
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		System.out.println("enter start index");
		start=sc.nextInt();
		System.out.println("enter end index");
		end = sc.nextInt();
		System.out.print(substr(s, start, end));
	}
	
	public static String substr(String s, int start, int end)
	{
		char []ch = s.toCharArray();
		String result = "";
		for(int i=start; i<=end; i++)
		{
			result += ch[i];
		}
		return result;
	}

}
