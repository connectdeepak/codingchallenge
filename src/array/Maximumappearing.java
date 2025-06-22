package array;

public class Maximumappearing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] left = {1,2,4};   // 1,2,3,4  2,3,4,5 ,4,5,6,7
		
		int [] right = {4,5,7};
		
		//maxAppearing_naive(left, right);
		maxAppearing(left, right);
		

	}
	
	
public static int maxAppearing(int[] left , int [] right) {
		
		int n = left.length;
		int[] freq = new int [101];
		
		for(int i=0 ;i <n ;i++) {
			freq[left[i]]++;	
			freq[right[i]+1]--;
		}
		
		int[]freqPrefix = new int [101];
		
		freqPrefix[0] = freq[0];
		
		for(int i =1 ;i < freq.length;i++) {
			
			freqPrefix[i] =  freqPrefix[i-1]+ freq[i];
			
			System.out.println(freqPrefix[i]);
		}
		
		int res =0 ;
		for(int i =0 ; i <freqPrefix.length ; i++) {
			
			if(freqPrefix[res] < freqPrefix[i]) {
				res =i;
			}
		}
		
		System.out.println(res);
		return res;
		
}
	
	public static int maxAppearing_naive(int[] left , int [] right) {
		
		int n = left.length;
		
		int[] freq = new int [100];
		
		for(int i = 0 ;i <n ;i++) {
			
			for(int j =left[i] ;j <= right[i] ;j++) {
				freq[j]++;
			}
		}
		int res =0 ;
		for(int i =0 ; i <freq.length ; i++) {
			
			if(freq[res] < freq[i]) {
				res =i;
			}
		}
		
		System.out.println(res);
		return res;
		
	}

}
