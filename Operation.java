package practice;

public class Operation {
	int data = 50;
	void change(Operation op)
	{
		op.data=op.data+100;
		System.out.println(op.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation op = new Operation();
		System.out.println("before change "+op.data);  
		op.change(op);  
	    System.out.println("after change "+op.data);

	}

}
