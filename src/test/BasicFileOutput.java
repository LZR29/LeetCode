package test;

import java.io.*;

/**
 * @authoor linzerong
 * @create 2019-03-05 23:09
 */
public class BasicFileOutput {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("BufferedInputFile.java"));
        PrintWriter out = new PrintWriter(new FileWriter("BufferedInputFile2.java"));
        int line = 1;
        String s;
        while ((s = in.readLine()) != null){
            out.println(line++ + ":" + s);
        }
        out.close();
        in.close();
        File file = new File("BufferedInputFile2.java");
        System.out.println(file.getAbsolutePath());

    }
}
