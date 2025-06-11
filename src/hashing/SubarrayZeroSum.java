package hashing;

import java.util.HashSet;
import java.util.Set;

public class SubarrayZeroSum {

	public static void main(String[] args) {
		
	//	int[]nums = {1,4,13,-3,-10,5};
		
		int[]nums = {-4,3,1,-3};
		//o/p -Yes
		
		System.out.println(subarrayZeroSum_naive(nums));
		
		System.out.println(subarrayZeroSum(nums));

	}
	
	
	public static boolean subarrayZeroSum(int[] nums) {
		Set<Integer> set  = new HashSet<Integer>();
		int n = nums.length;
		
		int prefixSum = 0;
		
		for(int i=0 ;i <n ;i++) {
			prefixSum +=  nums[i];
			if(set.contains(prefixSum)) {
				return true;
			}
			
			if(prefixSum ==0) {
				return true;
			}
			set.add(prefixSum);
			
		}
		
		
		
		return false;
		
	}
	
	public static boolean subarrayZeroSum_naive(int[] nums) {
		
		int n = nums.length;
		for(int i=0 ;i<n ;i++) {
			
			int curr_sum = nums[i];
			for(int j =i+1 ;j<n ;j++) {
				
				curr_sum =curr_sum+nums[j];
				
				if(curr_sum == 0) {
					return true;
				}
				
			}
			
		}
		
		
		return false;
		
	}

}
