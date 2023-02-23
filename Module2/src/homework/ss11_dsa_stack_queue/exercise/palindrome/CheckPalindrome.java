package homework.ss11_dsa_stack_queue.exercise.palindrome;

import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        String palindromeString = "Able was I ere I saw Elba";

        char charPalindromeString;

        for (int i = 0; i < palindromeString.length(); i++) {
            charPalindromeString = palindromeString.charAt(i);

            stack.push(String.valueOf(charPalindromeString));
            queue.add(String.valueOf(charPalindromeString));
        }
        boolean checkPalindrome = true;
        while (!stack.isEmpty() && !queue.isEmpty()) {

            String stackElement = stack.pop();
            String queueElement = queue.remove();

            if (!stackElement.equalsIgnoreCase(queueElement)) {
                checkPalindrome = false;
                break;
            }
        }
        if (checkPalindrome) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not Palindrome.");
        }
    }
}
