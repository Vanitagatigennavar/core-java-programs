package com.xworkz.IEsoftTechnology;
import java.util.*;

import java.io.*;

public class LongestWord {
	String str;
    String stringArray[];
    
    public LongestWord() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = input.nextLine();
        stringArray = str.split("\\s");
        
        String word = "";
        for (int i = 0; i < stringArray.length; i++) {
            if (i == 0) {
                word = stringArray[0];
            }
            word = compare(word, stringArray[i]);
        }
        System.out.println("Longest word = " + word);
    }
    
    public String compare(String st1, String st2) {
        if (st1.length() > st2.length()) {
            return st1;
        } else {
            return st2;
        }
    }
    
    public static void main(String[] args) {
        new LongestWord();
    }
}
//input;"fun && time"
//output:Longest word = time"


