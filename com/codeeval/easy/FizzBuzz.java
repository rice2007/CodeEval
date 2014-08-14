package com.codeeval.easy;

import java.io.*;

public class FizzBuzz {
    public static void main (String[] args) throws IOException {
        File file = new File("C:\\Users\\Ajay\\Documents\\GitHub\\CodeEval\\src\\com\\codeeval\\easy\\New Text Document.txt");
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            String[] lineArray = line.split("\\s+");
            if (lineArray[0].equals("")) {
                continue;
            }
            if (lineArray.length > 0) {
                for (int i = 0; i < lineArray.length; i++) {
                    if (Integer.parseInt(lineArray[i]) % 3 == 0 && Integer.parseInt(lineArray[i]) % 5 == 0) {
                        System.out.print("FB ");
                    } else if (Integer.parseInt(lineArray[i]) % 3 == 0) {
                        System.out.print("F ");
                    } else if (Integer.parseInt(lineArray[i]) % 5 ==0) {
                        System.out.print("B ");
                    } else {
                        System.out.print(lineArray[i] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
