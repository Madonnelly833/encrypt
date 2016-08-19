package com.encrypt;

public class Validation {
	
	
		
		public static boolean validateChoice(String numberInput) {

			try {

				int isValid = Integer.parseInt(numberInput);
				if ((isValid < 0) || (isValid > 3)) {
					System.out.println("Invalid entry. Please enter a number 1 - 3");
					return true;
				}
				return false;
			}

			catch (NumberFormatException e) {
				System.out.println("Invalid entry. Please enter a number 1 - 3.");
				return true;
			}

		}

	}



