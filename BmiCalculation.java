package practice;

import java.util.Scanner;

public class BmiCalculation {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight;
		int feet;
		int inches;
		double weightinkg;
		double inch;
		double meter;
		double bmi;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter weight in pounds:");
		weight =  sc.nextDouble();
		System.out.println("enter height in feet:");
		feet = sc.nextInt();
		System.out.println("enter height in inches:");
		inches = sc.nextInt();
		weightinkg=weight*0.453592;
		System.out.println("your weight in kg:" + weightinkg + "kg");
		inch = ((feet*12)+inches);
		meter = inch * 0.0254 ; 
		System.out.println("your height in meters:"+meter);
		bmi = weightinkg/Math.pow(meter, 2);
		System.out.println(bmi);
		
		

	}

}
