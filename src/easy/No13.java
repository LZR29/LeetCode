package easy;

public class No13 {
	/*
	 * I             1
		V             5
		X             10
		L             50
		C             100
		D             500
		M             1000
	 */
	public static int romanToInt(String s) {
		int sum = 0;
		int length = s.length();
		for (int i = 0; i < length; i++) {
			char c = s.charAt(i);
			switch (c) {
			case 'I':if(i!=length-1) {
				if(s.charAt(i+1)=='V'||s.charAt(i+1)=='X') {
					sum--;
				}else {
					sum++;
				}
			}else {
				sum++;
			}break;
			case 'V':
				sum+=5;
			break;
			case 'X':if(i!=length-1) {
				if(s.charAt(i+1)=='L'||s.charAt(i+1)=='C') {
					sum-=10;
				}else {
					sum+=10;
				}
			}else {
				sum+=10;
			}break;
			case 'L':
				sum+=50;
			break;
			case 'C':if(i!=length-1) {
				if(s.charAt(i+1)=='D'||s.charAt(i+1)=='M') {
					sum-=100;
				}else {
					sum+=100;
				}
			}else {
				sum+=100;
			}break;
			case 'D':
				sum+=500;
			break;
			case 'M':
				sum+=1000;
			break;
			}
		}
		return sum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(No13.romanToInt("III"));
		System.out.println(No13.romanToInt("IV"));
		System.out.println(No13.romanToInt("IX"));
		System.out.println(No13.romanToInt("LVIII"));
		System.out.println(No13.romanToInt("MCMXCIV"));
	}

}
