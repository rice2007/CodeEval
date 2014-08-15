package com.codeeval.easy;

import java.io.*;

public class SumOfDigits {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Ajay\\Documents\\GitHub\\CodeEval\\com\\codeeval\\easy\\sumdigits.txt");
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            char[] lineArray = line.toCharArray();
            int sum = 0;
            if (lineArray.length > 0) {
                for (int i = 0; i < lineArray.length; i++) {
                    sum += Character.getNumericValue(lineArray[i]);
                }
            }
            System.out.println(sum);
        }
    }
}
