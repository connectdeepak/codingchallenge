package recursion;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int fib(int n) {
		
		if(n==0 || n==1)
		{
			return n;
		}
		return fib(n-1)+ fib(n-2);
	}

}
