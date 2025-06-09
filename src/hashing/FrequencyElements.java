package hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {15,12,13,12,13,13,18};
		frequency(nums);
		
	}
	
	public static void frequency(int[] nums) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int n = nums.length;
		
		for(int i =0 ;i<n ;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		map.forEach((k,v)-> System.out.println(k +" " + v));
		
		
	}

}
