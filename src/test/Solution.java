package test;

import java.util.ArrayList;

/**
 * @author linzerong
 * @create 2019-03-06 16:31
 */
public class Solution {

    public static int StrToInt(String str) {
        if(str.isEmpty()){
            return 0;
        }
        int sum = 0;
        boolean flag = false;
        if(str.charAt(0) == '-'){
            flag = true;
        }
        int i = 1;
        if(str.charAt(0) >= '1' && str.charAt(0) <= '9'){
            i--;
        }else if(str.charAt(0) == '+' || str.charAt(0) == '-'){

        }else{
            return 0;
        }
        for(; i < str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                System.out.println((str.charAt(i) - '0'));
                sum = sum * 10 + (str.charAt(i) - '0');
            //    System.out.println(sum);
            }else{
                return 0;
            }
        }
        if(flag){
            sum = 0 - sum;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(StrToInt("123"));
    }
}
