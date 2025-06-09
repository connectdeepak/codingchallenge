
public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static boolean isAnagram(String s, String t) {
		 
		 if(s.length() != t.length()) {
			 return false;
		 }
		 
		 int CHAR = 256;
		 
		 int [] count =new int[CHAR];
		 
		 for(int j =0 ; j< t.length() ;j++) {
			 count[t.charAt(j)]++;
			 count[s.charAt(j)]--;
		 }
		 
		 for( int k =0 ; k<CHAR ;k++) {
			 if(count[k] !=0)
				 return false;
		 }
		return true;
	        
	    }

}
