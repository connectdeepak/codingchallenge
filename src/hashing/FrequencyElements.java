package hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyElements {

	public static void main(String[] args) {

		int[] nums = { 15, 12, 13, 12, 13, 13, 18 };
		frequency(nums);
		
		System.out.println("-----------");
		
		frequency_naive(nums);

	}

	public static void frequency(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		map.forEach((k, v) -> System.out.println(k + " " + v));
	}

	public static void frequency_naive(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
		boolean seenalready = false ;
		for(int j=0 ;j<i ;j++) {
			if(nums[i] ==  nums[j]) {
				seenalready =true;
				break;
			}
		}
		if(seenalready) {
			continue ; 
		}
		int freq =1;
		
		for(int j = i+1 ;j<n ;j++) {
			
			if(nums[i] == nums[j]) {
				freq++;
			}
		}
		
		System.out.println(nums[i] +" " + freq);
			
		}

	}
}
