package Task_01;

import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Palindrom {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Please, enter some word of 5 letters: ");
			String str = scan.next();
			if (str.length() != 5) {
				throw new Palindrom("A word should contain 5 letters");
			} else {
				checkWord(str);
			}
		}

	}

	public static void checkWord(String s) {
		StringBuilder strBuilder = new StringBuilder(s);
		strBuilder.reverse();
		String invertedText = strBuilder.toString();
		if (s.equalsIgnoreCase(invertedText)) {
			System.out.println("The word - palindrom!");
		} else {
			System.out.println("The word isn't palindrom!");
		}
	}

}
