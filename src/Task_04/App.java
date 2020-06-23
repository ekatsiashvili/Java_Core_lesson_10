package Task_04;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
	String[] m = "The most common word is the most frequent and this word is the most common of all words".split(" ");
	Arrays.sort(m);

	String maxWord = "", word = "";
	int maxCount = 0, count = 1;

	for (String s : m) {
	    if (s.equals(word)) {
	        count++;
	    } else {
	        if (count > maxCount) {
	            maxCount = count;
	            maxWord = word;
	        }
	        word = s;
	        count = 1;
	    }
	}

	if (count > maxCount) {
	    maxCount = count;
	    maxWord = word;
	}

	System.out.println("The most used word: " + "'"+maxWord+ "'" + " ( it is met " + maxCount + " times)");
}
}
