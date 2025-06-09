import java.util.HashSet;
import java.util.Set;

public class FindDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> divisor = new HashSet<Integer>();
		
		int n =100000;
		
		for(int i=1 ; i<Math.sqrt(n) ;i++) {
			if( n%i == 0) {
				divisor.add(i);
				divisor.add(n/i);
				
			}
			
		}
		
		System.out.println("divisor " + divisor);
		
		System.out.println("divisor  size " + divisor.size());

	}

}
