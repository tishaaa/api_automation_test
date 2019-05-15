package practice;

public class Callbyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 3;
		System.out.println("value of x before calling increment is:"+x);
		increment(x);
		System.out.println("value of x after calling increment is:"+x);
	}

	private static void increment(int a) {
		// TODO Auto-generated method stub
		System.out.println("value of a before calling increment is:"+a);
		a=a+1;
		System.out.println("value of a after calling increment is:"+a);
		
	}

}
