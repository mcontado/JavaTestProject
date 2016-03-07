
public class CheckMaxProfit {
	public static int checkMaxProfit(int[] stockPrices) {
		//start minimum price marker at first price
		int minStockPrice = stockPrices[0];
		//Start off with a profit of zero
		int maxProfit = 0;
		int comparisonProfit = 0;
		
		for (int price: stockPrices) {
			//Check to set the lowest stock price so far
			minStockPrice = Math.min(minStockPrice, price);
			
			//Check the current price against our minimum for a profit comparison 
			//against the maxProfit
			comparisonProfit = price - minStockPrice;
			
			//Compare against our maxProfit so far
			maxProfit = Math.max(maxProfit, comparisonProfit);
			
		}
			
		return maxProfit;
	}
	
	public static int maxProfit (int[] stockPrices) throws Exception {
		if (stockPrices.length < 2)
			throw new Exception("Need at least 2 stock prices");
		
		int minStockPrice = stockPrices[0];
		int maxProfit = stockPrices[1] - stockPrices[0];
		int comparisonProfit = 0;
		
		for (int i=1; i<stockPrices.length; i++) {
			comparisonProfit = stockPrices[i] - minStockPrice;
			maxProfit = Math.max(maxProfit, comparisonProfit);
			minStockPrice = Math.min(minStockPrice, stockPrices[i]);
		}
		
		
		return maxProfit;
	}
	
	public static void main(String[] args) throws Exception {
		int[] arr = {10,12,14,12,13,11,8,7,6,13,23,45,11,10};
		int[] arr2 = {30,22,21,5};
		System.out.println(maxProfit(arr2));

	}

}
