package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class No187 {
	
	public static List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        HashSet<String> subs = new HashSet<>();
        if(s.length() <= 10) {
        	return res;
        }
        for(int i = 0;i < s.length() - 9;i++) {
        	String sub = s.substring(i, i+10);
        	if(!subs.add(sub)&&!res.contains(sub))
        		res.add(sub);
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> res = findRepeatedDnaSequences("AAAAAAAAAAAA");
		for (String string : res) {
			System.out.println(string);
		}
	}

}
