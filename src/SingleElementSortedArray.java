
public class SingleElementSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] input = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
		
		//int[] input = {3,3,7,7,10,11,11 };
		
		int[] input = {0,1,1,2,2,5,5};
		
		

		System.out.println(singleNonDuplicate(input));

	}

	public static int singleNonDuplicate(int[] nums) {
		// use binary search
		int left = 0;
		int right = nums.length - 1;

		int result = nums[0];
		
		boolean isEven = false;

		while (right != left) {
			int mid = left + (right - left) / 2;
			// check mid element to its neighbour element
			if (nums[mid] == nums[mid-1]) {
				// check if the remainng element is even or not
				
				if(mid-1 -left== 0) {
					result = nums[mid+1];
					break;
				}
				
				isEven = (((mid -1 -left)%2==0)? true : false );
				
				if(!isEven) {
					right = mid;
				}
				else {
					left = mid+1;
				}
				
			} else if (nums[mid] == nums[mid + 1]) {
				
				if(right- (mid+1) == 0) {
					result = nums[mid-1];
					break;
				}
				
				isEven =  ((right- (mid+1))%2==0)?true :false;
				
				if(!isEven) {
					left = mid;
					
				}
				else {
					right = mid-1;
				}
			}

			else {
				// mid is the single element;
				result = nums[mid];
				break;
			}

		}
		return result;
	}
}
