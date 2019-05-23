package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linzerong
 * @create 2018-12-28 9:40
 */
public class No535 {
    Map<String,String> map = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String ans = "http://tinyurl.com/" + longUrl.hashCode();
        while (map.containsKey(ans)){
            ans = "http://tinyurl.com/" + ans.hashCode();
        }
        map.put(ans,longUrl);
        return ans;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
