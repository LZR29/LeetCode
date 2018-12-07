package easy;

import java.util.Stack;

public class No20 {
	
	 public static boolean isValid(String s) {
		 Stack<Character> characters = new Stack<Character>();
	     for (int i = 0; i < s.length(); i++) {
	    	 char c = s.charAt(i);
	    	 if(c=='('||c=='{'||c=='[') {
	    		 characters.push(c);
	    	 }else if(c==')'&&!characters.isEmpty()) {
    			 char c2 = characters.pop();
    			 if(c2 != '('&&!characters.isEmpty())
    				 return false;
    		 }else if (c=='}'&&!characters.isEmpty()) {
    			 char c2 = characters.pop();
    			 if(c2 != '{')
    				 return false;
			}else if (c == ']'&&!characters.isEmpty()) {
				char c2 = characters.pop();
   			 if(c2 != '[')
   				 return false;
			}else {
				return false;
			}
	     }
	     if(characters.isEmpty())
	    	 return true;
	     else {
	     		return false;
	     	}
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(No20.isValid("{]"));
	}

}
