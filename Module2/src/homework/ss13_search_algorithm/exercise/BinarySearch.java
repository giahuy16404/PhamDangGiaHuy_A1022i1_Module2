package homework.ss13_search_algorithm.exercise;

import java.util.Scanner;

public class BinarySearch {
    static int[] binarySort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int holdVlaue = arr[i];
                    arr[i] = arr[j];
                    arr[j] = holdVlaue;
                }
            }
        }
        return arr;
    }

    static int binarySearch(int[] list, int left, int right, int key) {
        int[] valueSortArr = binarySort(list);
        int mid = (left + right) / 2;
        if (left >= right) {
            return -1;
        }
        if (valueSortArr[mid] == key) {
            return mid;
        }
        if (key > valueSortArr[mid]) {
            return binarySearch(valueSortArr, mid + 1, right, key);
        }
        return binarySearch(valueSortArr, left, mid - 1, key);
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
