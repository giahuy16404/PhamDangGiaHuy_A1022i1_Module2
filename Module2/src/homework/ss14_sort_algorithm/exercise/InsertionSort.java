package homework.ss14_sort_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr ){
        for (int i = 1; i <arr.length ; i++) {
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j]< key){
                arr[j + 1] = arr[j];
                System.out.println("nếu các số  sau số " + key + "bé hơn thì " );
                System.out.println("arr["+j + "]"  + "=" +"arr["+(j + 1) +"]");
                 j--;
                System.out.println("xét tiếp phần tử phía sau ");
            }
            arr[j + 1] = key;
            System.out.println("đã thõa điê kiện thì gán arr["+ (j +1) + "]  = " + key);
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhập vào độ dài của mảng: ");
        Scanner sc = new Scanner(System.in);
        int sizeArr = sc.nextInt();

        int[] arr = new int[sizeArr];

        for (int i = 0; i <arr.length ; i++) {
            System.out.println("nhập vào phần tử tại ví trí "+i);
            arr[i] = sc.nextInt();
        }

        System.out.println("mảng ban đầu: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Mảng săp xếp chèn:" + Arrays.toString(arr));

    }
}
