package easy;


public class No67 {
	
	public static String addBinary(String a, String b) {
		char c1,c2;
		int i ,j,more = 0;
		StringBuilder res = new StringBuilder();
		for(i=a.length()-1,j=b.length()-1;(i>=0&&j>=0);i--,j--) {
			c1 = a.charAt(i);
			c2 = b.charAt(j);
			if(c1+c2-96+more==3) {
				more = 1;
				res.append('1');
			}else if (c1+c2-96+more==2) {
				more = 1;
				res.append('0');
			}else if (c1+c2-96+more==1) {
				more = 0;
				res.append('1');
			}else if (c1+c2-96+more==0) {
				more = 0;
				res.append('0');
			}
		}
		if(i >= 0) {
			for (int k = i; k >= 0; k--) {
				c1 = a.charAt(k);
				if(c1+more-48 == 2) {
					more = 1;
					res.append('0');
				}else if(c1+more-48==1) {
					more = 0;
					res.append('1');
				}else if (c1+more-48==0) {
					more = 0;
					res.append('0');
				}
			}
		}else if (j >= 0) {
			for (int k = j; k >= 0; k--) {
				c1 = b.charAt(k);
				if(c1+more-48 == 2) {
					more = 1;
					res.append('0');
				}else if(c1+more-48==1) {
					more = 0;
					res.append('1');
				}else if (c1+more-48==0) {
					more = 0;
					res.append('0');
				}
			}
		}
		if(more == 1) {
			res.append('1');
		}
		res = res.reverse();
		return res.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(No67.addBinary("1", "111"));
	}

}
