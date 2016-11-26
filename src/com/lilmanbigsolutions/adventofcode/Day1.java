package com.lilmanbigsolutions.adventofcode;

import java.io.BufferedReader;
import java.io.IOException;

public class Day1 {

	private final static String fileName = "Day1.txt";
	private final static String upOneFloor = "[(]";
	private final static String downOneFloor = "[)]";
	
	public static void main(String[] args) {
		
		BufferedReader reader = Helper.getReaderForFile(fileName);
		String line = null;
		try {
			line = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		int amountOfDownFloors = line.replaceAll(upOneFloor, "").length();
		int amountOfUpFloors = line.replaceAll(downOneFloor, "").length();
		
		System.out.print(amountOfUpFloors - amountOfDownFloors);
	}

}
