package interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-03-03 20:12
 */
public class Fizz_Buzz {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0){
                if(i % 5 == 0){
                    ans.add("FizzBuzz");
                }else {
                    ans.add("Fizz");
                }
            }else if(i % 5 == 0){
                ans.add("Buzz");
            }else {
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }
}
