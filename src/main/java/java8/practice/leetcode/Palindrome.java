package java8.practice.leetcode;

/*
 * Given an integer x, return true if x is a 
palindrome
, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 */
public class Palindrome {
    public static void main(String[] args) {
        
        Palindrome p = new Palindrome();
       System.out.println(p.isPalindrome(121)); 
    }
    public boolean isPalindrome(int x) {

        int originalNumber = x;
        int reversedNumber = 0;
        int reminder;
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false; // Negative numbers and numbers ending in 0 (excluding 0 itself) cannot be palindromes
        }
        while (x != 0) {
            reminder = x % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            x /= 10;
        }

        return originalNumber == reversedNumber;

    }

}
