package com.encrypt;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class UserInterface {

	static boolean USER_FAILED = false;
	static String ENCRYPTED;
	static String DECRYPTED;
	static int KEY = 47;
	static String USER_NAME = null;
	static String QUESTION1 = null;
	static String QUESTION2 = null;
	static String QUESTION3 = null;
	static String ANSWER1 = null;
	static String ANSWER2 = null;
	static String ANSWER3 = null;

	public static void main(String[] args) {

		System.out.println(
				"Please select your option:\n" + "To sign up, select 1 \n" + "To recover your user name, select 2 \n"
						+ "To recover your password, select 3 \n" + "To exit, select 4");

		Scanner sc = new Scanner(System.in);
		String menuSelection = sc.nextLine();
		int choice = Integer.parseInt(menuSelection);
		USER_FAILED = Validation.validateChoice(menuSelection);

		switch (choice) {
		case 1:
			System.out.println("Please choose your user name: ");
			USER_NAME = sc.nextLine();

			System.out.println("Please choose your password: ");
			String encryptThis = sc.nextLine();
			ENCRYPTED = Encrypt.encryptionizer(encryptThis, KEY);

			System.out.println("Please answer your security questions");
			System.out.println("What... is your name?");
			QUESTION1 = sc.nextLine();

			System.out.println("What... is your quest? ");
			QUESTION2 = sc.nextLine();

			System.out.println("What... is your favourite colour?");
			QUESTION3 = sc.nextLine();
			System.out.println("Your user name: " + USER_NAME);
			System.out.println("Your encrypted password: " + ENCRYPTED);
			break;

		case 2:
			System.out.println("Your user name is: " + USER_NAME);
			break;
		case 3:
			System.out.println("Please answer your security questions");
			System.out.println("What... is your name?");
			ANSWER1 = sc.nextLine();

			System.out.println("What... is your quest?");
			ANSWER2 = sc.nextLine();

			System.out.println("What... is your favourite colour?");
			ANSWER3 = sc.nextLine();

			if ((QUESTION1.equalsIgnoreCase(ANSWER1)) && (QUESTION2.equalsIgnoreCase(ANSWER2))
					&& (QUESTION3.equalsIgnoreCase(ANSWER3))) {
				DECRYPTED = Decrypt.decryptionizer(ENCRYPTED, KEY);
				System.out.println("Your password is: " + DECRYPTED);
				break;

			} else {
				
				try {
					Desktop userDesktop = java.awt.Desktop.getDesktop();
					URI url = new URI("https://youtu.be/_7iXw9zZrLo?t=2m17s");
					userDesktop.browse(url);

				} catch (IOException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());

				} catch (URISyntaxException ex) {
					ex.printStackTrace();
					System.out.println(ex.getLocalizedMessage());
				}
				
				break;
			}
		case 4:
			System.exit(0);
			sc.close();
		}

		UserInterface.main(args);

	}

}
