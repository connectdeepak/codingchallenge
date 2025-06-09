package recursion;

public class SumNNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum(5));

	}
	
	public static int sum(int n) {
		
		if(n <= 1) {
			return n;
		}
		else {
			return n+ sum(n-1);
		}
		
	}

}
