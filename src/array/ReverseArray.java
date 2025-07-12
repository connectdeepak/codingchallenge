package array;

public class ReverseArray {

	public static void main(String[] args) {
		int [] nums = {5,12,20,10,20};
		
		for(int i = 0 ;i<nums.length ;i++) {
			System.out.println(nums[i]);
		}
		
		reverseArray(nums);
		
		for(int i = 0 ;i<nums.length ;i++) {
			System.out.println(nums[i]);
		}

	}
	
	public static void reverseArray(int [] nums) {
		
		int low =0;
		int high = nums.length-1;
		
		while (low < high) {
			
			int temp = nums[low];
			nums[low] = nums[high];
			nums[high] = temp;
			low++;
			high--;
			
		}
		
		
		
	}

}
