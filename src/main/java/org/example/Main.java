package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String userWord = scanner.nextLine();

        // Check if the entered word is a palindrome
        boolean isPalindrome = PalindromeChecker.isPalindrome(userWord);

        // Display the result
        System.out.println(userWord + " is a palindrome: " + isPalindrome);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    public static class PalindromeChecker {

        public static boolean isPalindrome(String word) {
            // Remove spaces and convert to lowercase
            String cleanedWord = word.replaceAll("\\s", "").toLowerCase();

            // Compare the string with its reverse
            String reversedWord = new StringBuilder(cleanedWord).reverse().toString();

            return cleanedWord.equals(reversedWord);
        }
    }
}
