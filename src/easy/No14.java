package easy;

public class No14 {

	public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
			return "";
		}
		String res = strs[0];
		for (int i = 1; i < strs.length;) {
			if(strs[i].indexOf(res) != 0 && res.length()!=0) {
				res = res.substring(0, res.length() - 1);
			}
			else {
				 i++;
			}
		}
		return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String[] strs = {"ca","a"};
		String[] strs = {"flower","flow","flight"};
		System.out.println(No14.longestCommonPrefix(strs));
	//	System.out.println("do".substring(0, 0));
	//	System.out.println("d".indexOf("adas"));
	//	System.out.println("a".indexOf("c"));
		
	}

}
