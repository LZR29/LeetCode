package io;

import java.io.*;

/**
 * @author linzerong
 * @create 2019-08-17 18:35
 */
public class FileOutput {

    public static void main(String[] args) throws IOException {
        String filename = "H:\\IDEAWorkspace\\LeetCode\\Something\\io\\FileOutput.java";
        BufferedReader out = new BufferedReader(new FileReader(filename));
        int line = 1;
        String temp;
        String outfile = "H:\\IDEAWorkspace\\LeetCode\\Something\\io\\Output.txt";
        PrintWriter file = new PrintWriter(new FileWriter(outfile));
        while ((temp = out.readLine()) != null){
            file.write(line++ + ":" + temp + "\n");
        }
        file.close();
        out.close();
    }
}
