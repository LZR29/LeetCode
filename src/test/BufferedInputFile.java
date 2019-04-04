package test;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @authoor linzerong
 * @create 2019-03-05 22:39
 */
public class BufferedInputFile {
    public static int a = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("BufferedInputFile.java"));
        String s;
        LinkedList<String> list = new LinkedList<>();
        Iterator<String> iterator;
        while ((s = br.readLine()) != null){
            list.add(s);
        }
        iterator = list.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        br.close();
    }
}
