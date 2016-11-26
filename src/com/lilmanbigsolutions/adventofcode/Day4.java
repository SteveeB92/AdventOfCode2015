package com.lilmanbigsolutions.adventofcode;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Day4 {

	private static final String secretKey = "ckczppom";
	private static final String algorithm = "MD5";
	
	public static void main(String[] args) {
		
		int i = 0;
		String outputString = "";

		try {
			MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
			while (!outputString.startsWith("00 00 0")){
				i++;
				outputString = "";
				String inputString = secretKey + i;
				byte[] bytesOfSecretKey = inputString.getBytes();
				byte[] digest = messageDigest.digest(bytesOfSecretKey);
				
				for (byte b : digest) {
					outputString += String.format("%02X ", b);
				}
			}	
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		System.out.print(outputString + "  " + i);
	}

}
