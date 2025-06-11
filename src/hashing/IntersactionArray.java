package hashing;

import java.util.HashSet;
import java.util.Set;

public class IntersactionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []nums1 = {10,15,20,25,30,35};
		int []nums2 = {30,5,15,80};
		
		//result - 15 30
		
		intersactingElement(nums1, nums2);

	}
	
	public static void intersactingElement(int[]nums1 , int []nums2) {
		
		int a = nums1.length;
		int b  = nums2.length;
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i =0 ; i<b ;i++) {
			set.add(nums2[i]);
	}
		for(int i =0 ;i <a ; i++) {
			if(set.contains(nums1[i])) {
				System.out.println(nums1[i]);
			}
			
		}
		

}
}
