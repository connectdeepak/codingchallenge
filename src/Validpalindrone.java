
public class Validpalindrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String inputs = "A man, a plan, a canal: Panama";
		String inputs= "race a car";
	//	System.out.println(isPalindrome(inputs));
		
		subSequence("ABC");

	}
	
	public static void subSequence(String str) {
		 int n = str.length();
		 
		 System.out.println("--" + (1 << n) );
	        for (int i = 0; i < (1 << n); i++) {
	            StringBuilder sub = new StringBuilder();
	            for (int j = 0; j < n; j++) {
	                if ((i & (1 << j)) != 0) {
	                    sub.append(str.charAt(j));
	                }
	            }
	            System.out.println(sub.toString());
	        }
		
	}
	
public static boolean isPalindrome(String s) {
	
	
	 s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
	 
	 
	 System.out.println("s  " +s);
	
	int startIndex =0;
	int endIndex = s.length()-1;
	while (startIndex < endIndex  &&  endIndex > 0) {
		if(s.charAt(startIndex) == s.charAt(endIndex)) {
			endIndex--;
			startIndex++;
		}
		else
			return false;
	}
	return true;
    }

}
