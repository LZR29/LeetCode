package easy;

public class No121 {
	
	public static int maxProfit(int[] prices) {
     /*   int profit = 0;
        for (int i = 1; i < prices.length; i++) {
			for(int j = 0;j < i;j++) {
				int pro = prices[i] - prices[j];
				if(profit < pro)
					profit = pro;
			}
		}
		时间太久
		*/
		if(prices.length < 2)
			return 0;
		int profit = 0;
		int min = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if(prices[i] < min)
				min = prices[i];
			else {
				if(profit < prices[i] - min)
					profit = prices[i] - min;
			}
		}
        return profit;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,6,1,3,1};
		System.out.println(No121.maxProfit(prices));
	}

}
