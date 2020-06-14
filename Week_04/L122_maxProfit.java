package Week4;

public class L122_maxProfit {
	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int ret = new L122_maxProfit().maxProfit(prices);
		System.out.println(ret);
	}

	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				maxProfit += prices[i] - prices[i - 1];
			}
		}
		return maxProfit;
	}

}
