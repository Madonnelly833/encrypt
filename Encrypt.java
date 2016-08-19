package com.encrypt;

public class Encrypt {

	protected static String encryptionizer(String encryptThis, int KEY) {
		int stringLength = encryptThis.length();
		String encrypted = "";
		int newCharValue;
		char newChar;
		
		for (int character = 0; character < stringLength; character++) {
			char currentChar = encryptThis.charAt(character);
			newCharValue = (int) currentChar + KEY;
			newChar = (char) newCharValue;
			encrypted += Character.toString(newChar);
		}
		
		return encrypted;
	}
}
