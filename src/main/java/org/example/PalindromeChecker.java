package org.example;

public class PalindromeChecker {

    public static boolean isPalindrome(String word) {
        // Remove spaces and convert to lowercase
        String cleanedWord = word.replaceAll("\\s", "").toLowerCase();

        // Compare the string with its reverse
        String reversedWord = new StringBuilder(cleanedWord).reverse().toString();

        return cleanedWord.equals(reversedWord);
    }
}
