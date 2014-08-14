package com.codeeval.easy;

import java.io.*;

public class ReverseWords {
    public static void main (String[] args) throws IOException {
        File file = new File("C:\\Users\\Ajay\\Documents\\GitHub\\CodeEval\\src\\com\\codeeval\\easy\\RevWords.txt");
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            String[] lineArray = line.split("\\s");
            String[] copyArray = new String[lineArray.length];
            if (lineArray.length > 0) {
                for (int i = 0; i < lineArray.length; i++) {
                    copyArray[lineArray.length - 1 - i] = lineArray[i];
                }
                stringify(copyArray);
            }
        }
    }

    public static void stringify(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + " ");
            } else {
                System.out.println(array[i]);
            }
        }
    }
}
