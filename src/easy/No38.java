package easy;

public class No38 {
	
	public static String countAndSay(int n) {
		StringBuilder cur = new StringBuilder("1");
		StringBuilder pre;
		char c;
		int count;
		for (int i = 1; i < n; i++) {
			count = 1;
			pre = cur;
			cur = new StringBuilder();
			c = pre.charAt(0);
			for(int j=1;j<pre.length();j++) {
				if(pre.charAt(j)!=c) {
					cur.append(count);
					cur.append(c);
					count=1;
					c=pre.charAt(j);
				}else {
					count++;
				}
			}
			cur.append(count);
			cur.append(c);
		}
		return cur.toString();
    
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(No38.countAndSay(5));
	}

}
