package test;

import java.io.IOException;
import java.io.StringReader;

/**
 * @author linzerong
 * @create 2019-03-05 22:53
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader sr = new StringReader("ASDASDASDASDasdgsgdsnsf/ndsfsd");
        int c;
        while ((c = sr.read()) != -1){
            System.out.print((char) c);
        }
    }
}
