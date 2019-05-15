package practice;

public class Counter {
	static int cube(int x)
	{
		return x*x*x ;
	}
    static int square(int x)
	{
		return x*x*x*x ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = Counter.cube(3);
		int res2 = Counter.square(4);
		System.out.println(res);

	}

}
