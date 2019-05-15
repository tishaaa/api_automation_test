package practice;

import java.util.Scanner;

public class wordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int i, count=0;
		System.out.println("enter string:");
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		char []ch = s.toCharArray();
		for(i=0;i<ch.length;i++)
		{
			 ch[i]= s.charAt(i);  
             if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
             {
            	 count++;  
             }
                
		}
		System.out.println(count);

	}

}
