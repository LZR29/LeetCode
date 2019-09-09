package io;

import java.io.IOException;
import java.io.StringReader;

/**
 * @author linzerong
 * @create 2019-08-17 18:30
 */
public class MemoryInput {

    public static void main(String[] args) throws IOException {
        //从内存读取
        String input = "这是在内存中的字符串！";
        StringReader stringReader = new StringReader(input);
        int c = 0;
        while ((c = stringReader.read()) != -1){
            System.out.print(((char) c));
        }
    }
}
