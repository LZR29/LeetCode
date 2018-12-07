package medium;

import java.util.HashMap;
import java.util.Map;

public class No926 {
	
	public static int minFlipsMonoIncr(String S) {
        int len = S.length();
        int[] p = new int[len+1];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
			p[i+1] = p[i] + (S.charAt(i) == '1'? 1:0);
		}
        for (int i = 0; i <= len; i++) {
			min = Math.min(min, p[i]+len-i-(p[len]-p[i]));//p[i]:第i个前有p[i]个1
		}													//len-i-(p[len]-p[i]:len-i为i位置后有多少个字符 	
        													//(p[len]-p[i]):总字符‘1’的个数为p[len]  i位置后总共有多少个字符‘1’								
        return min;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minFlipsMonoIncr("00110"));
	//	System.out.println('0'+0);
	}

}
