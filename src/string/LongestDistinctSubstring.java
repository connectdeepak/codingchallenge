package string;

import java.util.Arrays;

public class LongestDistinctSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inout str = abaacdbab
		
		longestDistinctSubstring_naive("abac");
		// a ab aba abac

	}
	
	
	public static int longestDistinctSubstring(String str) {
		// use the conscept of maxEndJ ->  maxEndj +1 if jthe elemnt is not present in maxEnd(J-1)
		// or j -prevENding of jth character (i) +1
		
		int n = str.length();
		int res =0;
		
		int[]prev = new int[256];
		Arrays.fill(prev, -1);
		
		int  i =0;
		for(int j =0 ;j <n ;j++) {
			i = Math.max(i, prev[str.charAt(j)]);
			int maxEnd = j-i+1;
			res = Math.max(res, maxEnd);
			prev[str.charAt(j)] = j;
			
		}
		
		return res;
	}
	
	public static int longestDistinctSubstring_naive(String str) {
		
		int n = str.length();
		int res =0;
		
		for(int i =0 ;i<n ;i++) {
			boolean[]visted = new boolean[256];
			for(int j = i ;j<n ;j++) {
				
			if(	visted[str.charAt(j)] ==true ) {
				break;
			}
			res = Math.max(res, j-i+1);
			visted[str.charAt(j)]=true;
			}
		}
		
		System.out.println(res);
		return res;
	}
}
