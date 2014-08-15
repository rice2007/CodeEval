package com.codeeval.mod;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LongestLines {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        line = in.readLine();
        int n = Integer.parseInt(line);
        String[] longestArray = new String[n];
        while ((line = in.readLine()) != null) {
            String[] lineArray = line.split("\\s");
            if (lineArray.length > 0) {
                for (int i = 0; i < lineArray.length; i++) {
                    for (String s : longestArray) {
                        if (s == null) {
                            s = longestArray[i];
                            break;
                        }
                    }
                }
            }
        }
    }
}
