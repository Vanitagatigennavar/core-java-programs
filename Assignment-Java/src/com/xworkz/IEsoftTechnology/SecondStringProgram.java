package com.xworkz.IEsoftTechnology;
import java.util.Scanner;
public class SecondStringProgram {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the input string: ");
		        String text = scanner.nextLine();
		        String encodedString = runLengthEncoding(text);
		        System.out.println(encodedString);
		        scanner.close();
		    }

		    public static String runLengthEncoding(String text) {
		        String encodedString = "";

		        for (int i = 0, count = 1; i < text.length(); i++) {
		            if (i + 1 < text.length() && text.charAt(i) == text.charAt(i + 1))
		                count++;
		            else {
		                encodedString = encodedString.concat(Integer.toString(count))
		                        .concat(Character.toString(text.charAt(i)));
		                count = 1;
		            }
		        }
		        return encodedString;
		    }
		}
//Input: "aabbcde"
//output :"2a2b1c1d1e1"
	
//input :"wwwbbbw"
//output :"3w3b1w1"


