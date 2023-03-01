package homework.ss13_search_algorithm.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {
    static int[] binarySort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j =0; j < arr.length -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int holdVlaue = arr[i];
                    arr[i] = arr[j];
                    arr[j] = holdVlaue;
                }
            }
        }
        return arr;
    }

    static int binarySearch(int[] list, int left, int right, int key) {
//        int[] valueSortArr = binarySort(list);
        Arrays.sort(list);
        int mid = (left + right) / 2;
        if (left >= right) {
            return -1;
        }
        if (list[mid] == key) {
            return mid;
        }
        if (key > list[mid]) {
            return binarySearch(list, mid + 1, right, key);
        }
        return binarySearch(list, left, mid - 1, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng");
        int sizeArr = sc.nextInt();
        int[] arr = new int[sizeArr];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập vào phần tử tại vị trí" + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("---------");
        System.out.println("Nhập vào số bạn muốn tìm");
        int keyArr = sc.nextInt();
        System.out.println(binarySearch(arr, 0, arr.length - 1, keyArr));
    }
}
