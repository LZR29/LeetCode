package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author linzerong
 * @create 2019-08-17 18:22
 */
public class BufferedInputFile {

    public static void main(String[] args) throws IOException {
        String filename = "H:\\IDEAWorkspace\\LeetCode\\Something\\io\\BufferedInputFile.java";
        BufferedReader buffer = new BufferedReader(new FileReader(filename));
        String temp;
        StringBuilder sb = new StringBuilder();
        while ((temp = buffer.readLine()) != null){
            sb.append(temp).append("\n");
        }
        buffer.close();
        System.out.println(sb.toString());
    }
}
