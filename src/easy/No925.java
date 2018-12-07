package easy;

public class No925 {
	
	public static boolean isLongPressedName(String name, String typed) {
        if(name.equals(typed))
        	return true;
        if(name.length() > typed.length())
        	return false;
        char[] nameChars = name.toCharArray();
        char[] typedChars = typed.toCharArray();
        int num1 = 1,num2 = 0; 
        int len1 = name.length();
        int len2 = typed.length();	// leelee  lleeelee
        int i = 0,j = 0;
        for ( i = 0; i < len1 - 1; i++) {
			if(nameChars[i] == nameChars[i+1]) {
				num1++;
			}else {
				for(j = j-num2;j < len2;j++) {
					if(nameChars[i] == typedChars[j]) {
						num2++;
					}else if(num2 != 0){
						if(num2 < num1)
							return false;
						num2 = 0;
						num1 = 1;
						break;
					}else {
						return false;
					}
				}
			}
		}
        num1 = 1;
        num2 = 0;
        for(i = len1 -1;i > 0;i--) {
        	if(nameChars[i] == nameChars[i-1])
        		num1++;
        	else {
				for(j = len2 - 1; j >=0 ;j--) {
					if(nameChars[i] == typedChars[j])
						num2++;
					else {
						if(num1 > num2)
							return false;
						break;
					}
				}
				break;
			}
        }
		return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(No925.isLongPressedName("leelee", "lleeelee"));
	}
/*	
	
*/}
