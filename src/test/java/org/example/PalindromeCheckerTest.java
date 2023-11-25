package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void isPalindrome_withPalindromeWord_shouldReturnTrue() {
        // Arrange
        String palindromeWord = "level";

        // Act
        boolean result = PalindromeChecker.isPalindrome(palindromeWord);

        // Assert
        assertTrue(result);
    }

    @Test
    void isPalindrome_withNonPalindromeWord_shouldReturnFalse() {
        // Arrange
        String nonPalindromeWord = "hello";

        // Act
        boolean result = PalindromeChecker.isPalindrome(nonPalindromeWord);

        // Assert
        assertFalse(result);
    }

    @Test
    void isPalindrome_withPalindromePhrase_shouldReturnTrue() {
        // Arrange
        String palindromePhrase = "A man a plan a canal Panama";

        // Act
        boolean result = PalindromeChecker.isPalindrome(palindromePhrase);

        // Assert
        assertTrue(result);
    }

    // Add more test cases as needed
}
