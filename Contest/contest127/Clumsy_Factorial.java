package contest127;

import com.sun.javafx.css.CalculatedValue;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-03-10 10:46
 */
public class Clumsy_Factorial {
    public static int helper(StringBuilder exp) {
        int ans = 0;
        List<Integer> nums = new ArrayList<>();
        char flag;

        return ans;
    }
    public static int clumsy(int N) {
        int ans = N;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        int i = N - 1;
        for (i = N - 1; i > 0; i--,count++) {
            if(count % 4 == 0){
                ans *= i;
            }else if(count % 4 == 1){
                ans /= i;
                list.add(ans);
            }else if(count % 4 == 2){
                list.add(i);
            }else if(count % 4 == 3){
                ans = i;
            }
        }
        if(N % 4 == 0 || N % 4 == 3){
            ans = list.get(0);
            boolean fl = true;
            for (int j = 1; j < list.size() ; j++) {
                if(fl) {
                    ans += list.get(j);
                    fl = false;
                }else {
                    ans -= list.get(j);
                    fl = true;
                }
            }
        }else if(N % 4 == 1){
            ans = list.get(0);
            boolean fl = true;
            for (int j = 1; j < list.size() ; j++) {
                if(fl) {
                    ans += list.get(j);
                    fl = false;
                }else {
                    ans -= list.get(j);
                    fl = true;
                }
            }
            ans -= 1;
        }else if(N % 4 == 2){
            ans = list.get(0);
            boolean fl = true;
            for (int j = 1; j < list.size() ; j++) {
                if(fl) {
                    ans += list.get(j);
                    fl = false;
                }else {
                    ans -= list.get(j);
                    fl = true;
                }
            }
            ans -= 2;
        }
        /*for(int k : list){
            System.out.println(k);
        }*/
        return ans;
    }
    public static void main(String[] args)  {
        System.out.println(clumsy(3));
    }
}
