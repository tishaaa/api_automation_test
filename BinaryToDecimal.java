package practice;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0 , n ,dec = 0;
		System.out.println("enter binary number:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0) {
			dec = (int) (dec + ((n%10)*Math.pow(2, i)));
			n=n/10;
			i++;
		}
		System.out.println(dec);
		

	}

}
