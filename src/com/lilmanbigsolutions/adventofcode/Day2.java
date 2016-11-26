package com.lilmanbigsolutions.adventofcode;

import java.io.BufferedReader;
import java.io.IOException;

public class Day2 {

	private final static String fileName = "Day2.txt";
	private final static String arraySplitter = "x";
	public static void main(String[] args) {
		BufferedReader reader = Helper.getReaderForFile(fileName);

		int totalPaperRequired = 0;
		try {
			for(String line = reader.readLine(); line != null; line = reader.readLine())
			{
				String[] measurement = line.split(arraySplitter);
				int length = Integer.parseInt(measurement[0]);
				int width = Integer.parseInt(measurement[1]);
				int height = Integer.parseInt(measurement[2]);
				
				int paperRequired = (2 * length * width) + (2 * width * height) 
									+ (2 * length * height);
				
				int extraPaperRequired = Math.min(length * width, 
									Math.min(width * height,  length * height)); 
				
				totalPaperRequired += paperRequired + extraPaperRequired;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Paper Required: " + totalPaperRequired);
	}

}
