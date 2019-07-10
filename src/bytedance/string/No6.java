package bytedance.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-07-10 11:58
 */
public class No6 {
    public String simplifyPath(String path) {
        String[] words = path.split("/");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(".") || words[i].equals("")){
                continue;
            }else if (words[i].equals("..")){
                if(list.size() != 0){
                    list.remove(list.size() - 1);
                }
            }else {
                list.add(words[i]);
            }
        }
        if(list.size() == 0){
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for(String s : list){
            sb.append("/").append(s);
        }
        return sb.toString();
    }
}
