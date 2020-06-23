package Task_02;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Please, input a sentence: ");
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		
		char a[] = {'a','e','i','o','u','y','A','E','I','O','U','Y'};
		
		for(int i = 0; i < 12; i++) {
			sentence = sentence.replace(a[i],'-');
		}
		
		System.out.println(sentence);
		
		
	}

	
}