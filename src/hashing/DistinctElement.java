package hashing;

import java.util.HashSet;

public class DistinctElement {
	
	public static void main(String[] args) {
		
	//	int[] nums = {15,12,13,12,13,13,18};
		
		int[] nums = {13,13,13,13};
		
		System.out.println(distinctCount(nums));
		
	}
	
	public static int distinctCount(int [] nums) {
		
		HashSet<Integer> set  = new HashSet<Integer>();
		for(int i =0 ; i<nums.length ; i++) {
			set.add(nums[i]);
		}
		return set.size();
		
	}

}
