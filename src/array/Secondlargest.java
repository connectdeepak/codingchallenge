package array;

public class Secondlargest {

	public static void main(String[] args) {

		//int [] nums = {5,12,20,10,20};
		
		int [] nums = {20,20,20,20,20};
		
		//System.out.println(getSecondLargest_naive(nums));
		
		System.out.println(getSecondLargest(nums));
		
	}
	
	public static int getSecondLargest(int []nums) {
		
		int res =-1;
		int largest =0;
		int n = nums.length;
		
		for(int i =1 ;i<n ;i++) {
			
			if(nums[i] > nums[largest]) {
				res =largest;
				largest = i;
			}
			
			else if(nums[i] < nums[largest]) {
				
				if(res == -1 ||  nums[i] > nums[res]) {
					res = i;
				}
			}
		}
		
		return res ;
		
	}
	
	
	
	
	public static int getSecondLargest_naive(int []nums) {
		int largest = getLargest(nums);
		
		int res =-1;
		
		int n = nums.length;
		
		for(int i =0 ;i <n ;i++) {
			
			if(nums[i] != nums[largest]) {
				
				if(res == -1) {
					res =i;
				}
				else if(nums[i] > nums[res]) {
					res =i;
				}
			}
		}
		return res;
	}
	
	
	
	
	
	public static int getLargest(int []nums) {
		
		int result = 0;
		
		int n  = nums.length;
		
		for(int i =1 ;i<n ;i++) {
			if(nums[i] > nums[result]) {
				result =i;
			}
		}
		return result;
		
	}

}
