package easy;

public class No122 {
	
	public static int maxProfit(int[] prices) {
		if(prices.length < 2)
			return 0;
		int pro = 0,cur ;
		for (int i = 0; i < prices.length - 1; i++) {
			cur = prices[i];
			if(cur < prices[i+1]) {
				pro += prices[i+1] - cur;
			}
		}
		return pro;
    }
	
	public static void main(String[] args) {
		int[] prices = {1,2,3,3,5};
		// TODO Auto-generated method stub
		System.out.println(maxProfit(prices ));
	}

}
