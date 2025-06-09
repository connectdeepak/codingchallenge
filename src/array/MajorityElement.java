package array;

public class MajorityElement {

	public static void main(String[] args) {
		
		int[] nums = {2,2,1,1,1,2,2};
		
		System.out.println(majorityElement(nums));

	}
	
	public static int majorityElement(int [] nums) {
		
		int res =0;
		int count =1;
		int n  = nums.length;
		
		// find probable candidate
		
		for(int i =1 ; i<n ;i++) {
			
			if(nums[res] == nums[i]) {
				count++;
			}
			else {
				count --;
			}
			if(count ==0) {
				res =i;
				count=1;
			}
			
		}
		
		// till this point we found the probable candidate
		
		count =0;
		for(int i=0 ;i <n ;i++) {
			
			if(nums[i] == nums[res]) {
				count++;
			}
		}
		
		if(count <=n/2) {
			res =-1;
		}
		
		return nums[res];
		
	}

}
