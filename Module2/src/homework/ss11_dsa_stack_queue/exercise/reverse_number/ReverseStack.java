package homework.ss11_dsa_stack_queue.exercise.reverse_number;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//
//        Stack<Integer> wStack = new Stack<>();
//        for (int i = 0; i < size; i++) {
//            System.out.println("Enter the element at the position:" + i);
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < size; i++) {
//            wStack.push(arr[i]);
//        }
//        for (int i = 0; i < size; i++) {
//            arr[i] = wStack.pop();
//        }
//        for (int i = 0; i < size; i++) {
//            System.out.println(arr[i]);
//        }
        System.out.println("==============================================");

        Stack<String> wStack = new Stack<>();
        System.out.println("Enter a string ");
        String mWorld = sc.nextLine();

        for (int i = 0; i < mWorld.length(); i++) {
            wStack.push(String.valueOf(mWorld.charAt(i)));
        }
        System.out.println("---Trước khi POP---");
        System.out.println(wStack);
        System.out.println("---Sau khi POP---");
        while (!wStack.empty()) {
            mWorld = wStack.pop();
            System.out.print(mWorld);
        }
    }
}







