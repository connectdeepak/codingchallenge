
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int reverse(int x) {
		 
		 int sign = (x < 0) ?-1:1;
		 
		 // get the absolute value
		x = Math.abs(x);
		
		long reversed = 0;
		
		while(x!=0) {
			
			int digit = x%10;
			
			x = x/10;
			
			reversed = reversed*10 +digit;
		}
		
		if(reversed > Integer.MAX_VALUE || reversed<Integer.MIN_VALUE) {
			return 0;
		}
		
		return (int) (sign* reversed);
		 
	        
	    }

}
