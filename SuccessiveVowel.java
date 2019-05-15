package practice;

import java.util.Scanner;

public class SuccessiveVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int i, j, result = 0, k , count;
		System.out.println("enter string:");
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		char []ch=s.toCharArray();
		char[] v = {'a', 'e', 'i', 'o', 'u'};
		for(i=0;i<ch.length;i++)
		{   
			count=0;
			for(k=i;k<ch.length;k++)
			{
				for(j=0;j<v.length;j++)
				{
					if(ch[k]==v[j])
					{
						count++;
						break;
					}
				}
				if(j==v.length)
				{   
					i=k+1;
					break;
				}
			}
			if(count>1)
			{
				result++;
			}
			
		}
		System.out.println(result);

	}

}
