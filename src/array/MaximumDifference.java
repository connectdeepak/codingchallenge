package array;

public class MaximumDifference {

	public static void main(String[] args) {
		int [] nums = {2,3,10,6,4,8,1};
		
		System.out.println(maxDiff(nums));
		
	}
	
	public static int maxDiff(int[]nums) {
		int maxDiff = nums[1] - nums[0];
		int minNum = nums[0];
		
		int n = nums.length;
		
		for(int i=1 ;i <n ;i++) {
			
			maxDiff = Math.max(maxDiff, nums[i] - minNum);
			minNum= Math.min(nums[i], minNum);
		}
		return maxDiff;
		
	}

}
