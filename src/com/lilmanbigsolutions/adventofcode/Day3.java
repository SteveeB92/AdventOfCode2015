package com.lilmanbigsolutions.adventofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Day3 {

	public final static String fileName = "Day3.txt";
	
	private enum Directions
	{
		DOWN('v'),
		RIGHT('>'),
		UP('^'),
		LEFT('<');

	    private final char directionChar;

	    private char getDirectionChar(){
	    	return directionChar;
	    }
	    
	    private Directions(char directionChar) {
	        this.directionChar = directionChar;
	    }
	    
	    public static Directions fromChar(char directions){
	    	for(Directions e:Directions.values()){
	    		if(e.getDirectionChar() == directions){
	    			return e;
	    		}
	    	}
	    	throw new RuntimeException("Enum not found");
	    }
	}
	
	public static void main(String[] args) {
		
		BufferedReader reader = Helper.getReaderForFile(fileName);
		ArrayList<String> housesVisited = new ArrayList<String>();

		int xCoord = 0;
		int yCoord = 0;
		
		housesVisited.add("" + xCoord + "," + yCoord);
		try {
			for (int i = reader.read(); i > -1; i = reader.read())
			{
				char directionChar = (char) i;
			
				switch (Directions.fromChar(directionChar)) {
					case DOWN:
						yCoord -= 1;
						break;
					case LEFT:
						xCoord -= 1; 
						break;
					case RIGHT:
						xCoord += 1;
						break;
					case UP:
						yCoord += 1;
						break;
					default:
						break;
				}
				
				if (!housesVisited.contains("" + xCoord + "," + yCoord))
				{
					housesVisited.add("" + xCoord + "," + yCoord);
				}
			}
			
			System.out.println("Distinct Houses Visited: " + housesVisited.size());
				
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
