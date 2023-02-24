package homework.ss11_dsa_stack_queue.exercise.binary_conversion;

import java.util.Scanner;
import java.util.Stack;

public class StackBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number you want to convert to binary.");
        int numberDecimal = sc.nextInt();

        int sumBinary;
        while (numberDecimal > 0) {
            sumBinary = numberDecimal % 2;
            stack.push(sumBinary);
            numberDecimal /= 2;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }
}
