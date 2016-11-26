package com.lilmanbigsolutions.adventofcode;

import java.io.BufferedReader;
import java.io.IOException;

public class Day5 {
	private final static String fileName = "Day5.txt";
	private final static String[] vowels = new String[]{"a", "e", "i", "o", "u"};
	private final static String[] disallowedStrings = new String[]{"ab", "cd", "pq", "xy"};
	
	public static void main(String[] args) {	
		BufferedReader reader = Helper.getReaderForFile(fileName);
		int amountOfNiceLines = 0;
		try {
			for(String line = reader.readLine(); line != null; line = reader.readLine())
			{
				if (contains3Vowels(line) && doesNotContainDisallowedStrings(line)
						&& containsDoubleChars(line)){
					amountOfNiceLines++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print(amountOfNiceLines);
	}
	
	private static boolean contains3Vowels(String line){
		int amountOfVowels = 0;
		int lengthOfLine = line.length();
		for (String vowel : vowels){
			amountOfVowels +=  lengthOfLine - line.replace(vowel, "").length();
			
			if (amountOfVowels >= 3)
				return true;
		}
		return false;
	}
	
	private static boolean doesNotContainDisallowedStrings(String line){
		for (String disallowedString : disallowedStrings){
			if (line.contains(disallowedString))
				return false;
		}
		return true;
	}

	private static boolean containsDoubleChars(String line){
		for(char c = 'a'; c <= 'z'; c++){
			if (line.contains("" + c + c))
				return true;
		}
		return false;
	}
}
