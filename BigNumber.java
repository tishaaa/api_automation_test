package practice;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1, str2 , str3, t;
        int i, sum =0, carry=0;
       /* Scanner sc = new Scanner(System.in);
        System.out.println("enter first string:");
        str1 = sc.nextLine();
        System.out.println("enter second string:");
        str2 = sc.nextLine();*/
       // System.out.println(mul(multiply : "649","123"));
        System.out.println(fact(1000));
        
       
      
        
	}
	public static String add(String str1,String str2)
	{   
		String result ;
		result="";
		 if(str2.length()>str1.length())
	        {
	        	String t = str1;
	        	str1=str2;
	        	str2=t;
	        }
	        StringBuffer s1 = new StringBuffer(str1);
	        s1.reverse();
	        StringBuffer  s2 = new StringBuffer(str2);
	        s2.reverse();
	       char[] ch1=s1.toString().toCharArray();
	       char[] ch2=s2.toString().toCharArray();
	       char[] ch3 = new char[ch1.length+1];
	       int i, sum, carry = 0;
		for(i=0;i<ch2.length;i++)
	       {
	    	   sum = (ch1[i]-'0')+(ch2[i]-'0')+carry;
	    	   ch3[i]=(char) (sum%10 + '0');
	    	   carry=sum/10;
	       }
	       for(i=ch2.length;i<ch1.length;i++)
	       {
	    	   sum = (ch1[i]-'0')+carry;
	    	   ch3[i] =(char) (sum%10+'0');
	    	   carry=sum/10;
	       }
	       if(carry!=0)
	       {
	    	   ch3[i] = (char) carry;
	       }
	       //System.out.println(ch3.toString().trim());
	       result=new String(ch3);
	       result=result.trim();
	       StringBuffer r = new StringBuffer(result);
	       r.reverse();
	       result=r.toString();
	       
	   
		return result;
		
	}
	public static String mul(String str1,String str2)
	{   
		String partial_result="", result = "0";
		 if(str2.length()>str1.length())
	        {
	        	String t = str1;
	        	str1=str2;
	        	str2=t;
	        }
	        StringBuffer s1 = new StringBuffer(str1);
	        s1.reverse();
	        StringBuffer  s2 = new StringBuffer(str2);
	        s2.reverse();
	       char[] ch1=s1.toString().toCharArray();
	       char[] ch2=s2.toString().toCharArray();
	       
	       int i, mul, j, k;
		   for(i=0;i<ch2.length;i++)
	       {  
			 char[] ch3 = new char[ch1.length+1];
			 int carry = 0;
	    	 for(j=0;j<ch1.length;j++)
	    	 {
	    		 
	    		   mul = (ch1[j]-'0')*(ch2[i]-'0')+carry;
		    	   ch3[j]=(char) (mul%10 + '0');
		    	   carry=mul/10;
		    	   
	    	 }
	    	 if(carry!=0)
		     {
		    	   ch3[j] = (char)(carry+'0');
		     }
		     partial_result=new String(ch3);
		     partial_result=partial_result.trim();
		     StringBuffer r = new StringBuffer(partial_result);
		     r.reverse();
		     partial_result=r.toString();
		     for(k=0;k<i;k++)
		     {
		    	 partial_result+="0";
		     }
		     //System.out.println(partial_result tttt);
		     result=add(result,partial_result);
	       }
	       
	       
	   
		return result;
		
	}
	public static String fact(int n)
	{
		if(n==1)
		{
			return "1";
		}
		return mul(Integer.toString(n), fact(n-1));
		
	}
	

}
