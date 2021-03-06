package br.com.joelamalio.hackerrank.algorithms.strings.camelcase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the camelcase function below.
	static int camelcase(String s) {
		int amount = 1;
		for(int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))){
            	amount++;
            }
        }
		return amount;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		int result = camelcase(s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
