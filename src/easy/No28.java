package easy;

public class No28 {
	
	public static int strStr(String haystack, String needle) {
		if(needle == null)
			return -1;
		if(needle.length() == 0)
			return 0;
        int index = 0;
        index = haystack.indexOf(needle);
        return index;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(No28.strStr("",null));
		System.out.println(No28.strStr("",""));
		System.out.println(No28.strStr("asd",""));
		System.out.println(No28.strStr("adsda","as"));
		System.out.println(No28.strStr("aaa","aa"));
		System.out.println(No28.strStr("dasda","as"));
		System.out.println(No28.strStr("da","dasdasd"));
	}

}
