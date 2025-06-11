package hashing;

import java.util.HashSet;
import java.util.Set;

public class UnionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []nums1 = {10,15,20,25,30,35};
		int []nums2 = {30,5,15,80};
		
		System.out.println(unionCount(nums1,nums2));

	}
	
	public static int unionCount(int []nums1 , int []nums2 ) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0 ;i<nums1.length ;i++) {
			set.add(nums1[i]);
		}
		
		for(int i=0 ;i<nums2.length ;i++) {
			set.add(nums2[i]);
		}
		
		return set.size();
		
	}

}
