package string;

public class LaxoGraphicRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// dcba  - laxographic smaller than the given string +1
		

		System.out.println(factorial(5));

	}
	
	public static int laxoGrphicRank(String str) {
		
		int charc = 256;
		int n  = str.length();
		int factorialn = factorial(n);
		
		int[]count = new int[charc];
		
		for(int i=0 ;i <n ;i++) {
			count[str.charAt(i)]++;
		}
		
		// no of chacters smaller than the particaular character
		for(int i =1 ;i<charc ;i++) {
			count[i] =  count[i] + count[i-1];
		}
		
		int res =0 ;
		for(int i=0 ;i <n ;i++) {
			//no of chactaers imn right side less than str[i];
			 factorialn = factorialn/(n-1);
			
			 res = res+	count[str.charAt(i)-1]*factorialn;
			 
			 for(int j = str.charAt(i) ;j<charc ;j++) {
				 count[j]--;
			 }
		}
		
		return res+1;
	}
	
	public static int factorial(int n) {
		if(n ==1) {
			return n;
		}
		else {
			return	n*factorial(n-1);
		}
		
	}

}
