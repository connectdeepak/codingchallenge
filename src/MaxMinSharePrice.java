
public class MaxMinSharePrice {

	public static void main(String[] args) {

		//int[] sharePrice = { 2,4,1 };
		
		int[] sharePrice = {1,2,4,2,5,7,2,4,9,0,9};
		

		System.out.println("max profit - " + maxProfit1(sharePrice));

	}

	public static int maxProfit1(int[] prices) {
		
		int minPos = 0;
		int sellPos = 1;
		
		int maxProfit = 0;
		int profit = 0;
		
		while (sellPos != prices.length) {
			
			if(prices[sellPos] - prices[minPos]  > 0) {
				profit =  prices[sellPos] - prices[minPos];
				if(profit > maxProfit ) {
				maxProfit=  profit ;
				}
				
			}
			
			// move pointer of min position
			
			if(prices[minPos] >  prices[sellPos]) {
				minPos = sellPos;
			}
			sellPos++;
			
		}
		return maxProfit;
		
	}

	public static int maxProfit(int[] prices) {

		int minPos = 0;
		int maxPosAfterMin = 0;

		int result = 0;

		for (int i = 1; i < prices.length; i++) {

			if (prices[minPos] > prices[i]) {
				minPos = i;

			}

		}

		System.out.println("min position" + minPos);

		maxPosAfterMin = minPos;

		for (int i = minPos; i < prices.length; i++) {

			if (prices[maxPosAfterMin] < prices[i]) {
				maxPosAfterMin = i;
			}

		}

		System.out.println("max position" + maxPosAfterMin);

		if (maxPosAfterMin > minPos) {
			result = prices[maxPosAfterMin] - prices[minPos];
		}

		return result;

	}

}
