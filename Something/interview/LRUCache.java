package interview;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @authoor linzerong
 * @create 2019-03-04 17:54
 */
public class LRUCache {
    MyCache myCache;
    public LRUCache(int capacity) {
        this.myCache = new MyCache(capacity);
    }
    public int get(int key) {
        return myCache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        myCache.put(key,value);
    }
    class MyCache extends LinkedHashMap<Integer, Integer>{
        int max;
        MyCache(int max){
            super(max,0.75f,true);
            this.max = max;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > max;
        }
    }
}
