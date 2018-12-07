package medium;

public class No714 {
	
	public static int maxProfit(int[] prices, int fee) {
        int pro = 0;
        int curPro = 0;
        int max = prices[0], min = prices[0];
        for (int i = 1; i < prices.length; i++) {
			min = Math.min(min, prices[i]);
			max = Math.max(max, prices[i]);
			curPro = Math.max(curPro, prices[i]-min-fee);
			if(max - prices[i] >= fee) {
				pro += curPro;
				curPro = 0;
				max = prices[i];
				min = prices[i];
			}
		}
        return pro + curPro;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {1,3,2,8,6,9};
		int fee = 2;
//		Arrays.sort(prices);
		System.out.println(maxProfit(prices, fee));
	}

}
