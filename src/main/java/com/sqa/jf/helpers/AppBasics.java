package com.sqa.jf.helpers;

import java.util.*;

import com.sqa.jf.helpers.exception.*;

public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Method to farewell user from the application.
	 *
	 * @param name
	 *            User name to farewell to
	 */
	public static void farewellUser(String name) {
		System.out.println("Thanks for using this app.\nHave a great day "
				+ name + "!");
	}
	/**
	 * Method which greets user and gets their name.
	 * 
	 * @param appName
	 * @return
	 */
	public static String greetUserAndGetName(String appName) {
		System.out.println("Welcome to the " + appName + " Application.");
		System.out.println("Could I get your name please: ");
		return scanner.nextLine();
	}
	/**
	 * Method to request a boolean response from user.
	 *
	 * @param question
	 *            Question to ask the user
	 * @return Boolean response from the user
	 */
	public static boolean requestBoolean(String question) {
		boolean isInvalid = true;
		boolean response = false;
		String input = "";
		while (isInvalid) {
			System.out.print(question + " (Yes/No): ");
			input = scanner.nextLine();
			try {
				if (input.equalsIgnoreCase("yes")) {
					isInvalid = false;
					response = true;
				} else if (input.equalsIgnoreCase("no")) {
					isInvalid = false;
					response = false;
				} else {
					throw new InvalidBooleanResponse();
				}
			} catch (InvalidBooleanResponse e) {
				System.out.println("You have an incorrect response (Yes/No) ["
						+ input + "]");
			}
		}
		return response;
	}

	/**
	 * Method to request a byte response from user.
	 *
	 * @param question
	 *            Question to ask the user
	 * @return byte response from the user
	 */
	public static char requestChar(String question) {
		boolean isInvalid = true;
		String input = " ";
		while (isInvalid) {
			System.out.print(question + "  ");
			input = scanner.nextLine();
			try {
				if (input.length() > 1) {
					throw new InvalidCharResponseLength();
				}
				isInvalid = false;
			} catch (InvalidCharResponseLength e) {
				System.out.println("You have entered too many characters ["
						+ input + "]");
			}
		}
		return input.charAt(0);
	}

	/**
	 * Method to request a double response from user.
	 *
	 * @param question
	 *            Question to ask the user
	 * @return double response from the user
	 */
	public static float requestFloat(String question) {

		float value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + "  ");
			String input = scanner.nextLine();
			// return Integer.parseInt(input.trim());
			try {
				value = Float.parseFloat(input.trim());
				isInvalid = false;
			} catch (NumberFormatException e) {
				System.out
						.println("You have not entered a correct decimal formatted number [ "
								+ input + "] ");
			}
		}
		return value;
	}

	/**
	 * Method to request an int response from user.
	 *
	 * @param question
	 *            Question to ask the user
	 * @return int response from the user
	 */
	public static int requestInt(String question) {
		int value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + "  ");
			String input = scanner.nextLine();
			// return Integer.parseInt(input.trim());
			try {
				value = Integer.parseInt(input.trim());
				isInvalid = false;
			} catch (NumberFormatException e) {
				System.out
						.println("You have not entered a correct formatted number [ "
								+ input + "] ");
			}
		}
		return value;
	}

	/**
	 * Method to request a long response from user.
	 *
	 * @param question
	 *            Question to ask the user
	 * @return long response from the user
	 */
	public static int requestByte(String question) {
		byte value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scanner.nextLine();
			try {
				value = Byte.parseByte(input.trim());
				isInvalid = false;
			} catch (NumberFormatException e) {
				System.out
						.println("You have not entered a correct formatted number ["
								+ input + "]");
			}
		}
		return value;
	}

	/**
	 * Method to request a short response from user.
	 *
	 * @param question
	 *            Question to ask the user
	 * @return short response from the user
	 */
	public static short requestShort(String question) {
		short value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scanner.nextLine();
			try {
				value = Short.parseShort(input.trim());
				isInvalid = false;
			} catch (NumberFormatException e) {
				System.out
						.println("You have not entered a correct formatted number ["
								+ input + "]");
			}
		}
		return value;
	}

	/**
	 * Method to request a long response from user.
	 *
	 * @param question
	 *            Question to ask the user
	 * @return long response from the user
	 */
	public static long requestLong(String question) {
		long value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scanner.nextLine();
			try {
				value = Long.parseLong(input.trim());
				isInvalid = false;
			} catch (NumberFormatException e) {
				System.out
						.println("You have not entered a correct formatted number ["
								+ input + "]");
			}
		}
		return value;
	}

	/**
	 * Method to request a String response from user.
	 *
	 * @param question
	 *            Question to ask the user
	 * @return String response from the user
	 */
	public static String requestString(String question) {
		System.out.print(question + "  ");
		String input = scanner.nextLine();
		// return scanner.nextLine();
		return input.trim();
	}
}
