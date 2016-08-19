package com.encrypt;

public class Decrypt {
	
	protected static String decryptionizer(String ENCRYPTED, int KEY) {
		int stringLength = ENCRYPTED.length();
		String DECRYPTED = "";
		int newCharValue;
		char newChar;
		
		for (int character = 0; character < stringLength; character++) {
			char currentChar = ENCRYPTED.charAt(character);
			newCharValue = (int) currentChar - KEY;
			newChar = (char) newCharValue;
			DECRYPTED += Character.toString(newChar);
		}
		
		return DECRYPTED;
	}
}
