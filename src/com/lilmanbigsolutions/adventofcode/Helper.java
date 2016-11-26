package com.lilmanbigsolutions.adventofcode;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Helper {
	public static BufferedReader getReaderForFile(String fileName){
		InputStream inputFile = Day1.class.getResourceAsStream(fileName);
		InputStreamReader inputStreamReader = new InputStreamReader(inputFile);
		
		return new BufferedReader(inputStreamReader);
	}
}
